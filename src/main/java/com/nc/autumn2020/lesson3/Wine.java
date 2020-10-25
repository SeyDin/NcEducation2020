package com.nc.autumn2020.lesson3;
//неправильно прочитал и сделал 10 атрибутов, а удалять лень

public class Wine {
    //обязательные
    private long id;
    private String color;
    private String sweetness ;
    private int age;
    private double alcohol;
    //не обязательные
    private String winery;
    private String grapeSort;
    private String originCountry;
    private double volume;
    private int score;

    private Wine(Builder builder) {
        this.id = builder.id;
        this.color = builder.color;
        this.sweetness  = builder.sweetness ;
        this.age = builder.age;
        this.alcohol = builder.alcohol;
        this.winery = builder.winery;
        this.grapeSort = builder.grapeSort;
        this.originCountry = builder.originCountry;
        this.volume = builder.volume;
        this.score = builder.score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getsweetness () {
        return sweetness ;
    }

    public void setsweetness (String sweetness ) {
        this.sweetness  = sweetness ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public String getwinery() {
        return winery;
    }

    public void setwinery(String winery) {
        this.winery = winery;
    }

    public String getgrapeSort() {
        return grapeSort;
    }

    public void setgrapeSort(String grapeSort) {
        this.grapeSort = grapeSort;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static class Builder {
        //обязательные
        private long id;
        private String color;
        private String sweetness ;
        private int age;
        private double alcohol;
        //не обязательные
        private String winery = "Abrau";
        private String grapeSort = "Sauvignon";
        private String originCountry = "Russia";
        private double volume = 0.75;
        private int score = 8;

        /**
         *
         * @param id id not less 0
         * @param color Red, White ...
         * @param sweetness Very Dry, Off Dry, Medium, Sweet, Very Sweet
         * @param age How old?
         * @param alcohol How much?
         */

        public Builder(long id, String color, String sweetness, int age, double alcohol) {
            this.id = id;
            this.color = color;
            this.sweetness = sweetness;
            this.age = age;
            this.alcohol = alcohol;
        }

        public Builder winery(String winery){
            this.winery = winery;
            return this;
        }
        public Builder grapeSort(String grapeSort){
            this.grapeSort = grapeSort;
            return this;
        }
        public Builder originCountry(String originCountry){
            this.originCountry = originCountry;
            return this;
        }
        public Builder volume(double volume){
            this.volume = volume;
            return this;
        }
        public Builder score(int score){
            this.score = score;
            return this;
        }

        public Wine build(){
            return new Wine(this);
        }
    }

    @Override
    public String toString() {
        return "Wine{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", sweetness='" + sweetness + '\'' +
                ", age=" + age +
                ", alcohol=" + alcohol +
                ", winery='" + winery + '\'' +
                ", grapeSort='" + grapeSort + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", volume=" + volume +
                ", score=" + score +
                '}';
    }
}