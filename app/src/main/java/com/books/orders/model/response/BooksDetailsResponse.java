package com.books.orders.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonObject
public class BooksDetailsResponse {


    /**
     * status : true
     * statusMsg : null
     * successObject : {"primus":false,"image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613735.jpg","rating":0,"description":"","language":"English","wishlistAvailable":false,"city_wh_stock":[{"9":1},{"20":2},{"26":3}],"jb_info":{"times_rented":49,"author":{"id":87921,"name":"DANIELIE STEEL"},"titleid":613735,"avg_reading_time":7,"title":"CHILD'S PLAY","category":{"id":1,"name":"General"}}}
     * errorDescription : null
     * nextPageIsAvailable : false
     */

    private boolean status;
    private Object statusMsg;
    @JsonField(name = "successObject")
    private SuccessObjectBean successObject;
    private Object errorDescription;
    private boolean nextPageIsAvailable;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(Object statusMsg) {
        this.statusMsg = statusMsg;
    }

    public SuccessObjectBean getSuccessObject() {
        return successObject;
    }

    public void setSuccessObject(SuccessObjectBean successObject) {
        this.successObject = successObject;
    }

    public Object getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(Object errorDescription) {
        this.errorDescription = errorDescription;
    }

    public boolean isNextPageIsAvailable() {
        return nextPageIsAvailable;
    }

    public void setNextPageIsAvailable(boolean nextPageIsAvailable) {
        this.nextPageIsAvailable = nextPageIsAvailable;
    }

    @JsonObject
    public static class SuccessObjectBean {
        /**
         * primus : false
         * image_url : https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613735.jpg
         * rating : 0
         * description :
         * language : English
         * wishlistAvailable : false
         * city_wh_stock : [{"9":1},{"20":2},{"26":3}]
         * jb_info : {"times_rented":49,"author":{"id":87921,"name":"DANIELIE STEEL"},"titleid":613735,"avg_reading_time":7,"title":"CHILD'S PLAY","category":{"id":1,"name":"General"}}
         */

        private boolean primus;
        @JsonField(name = "image_url")
        private String image_url;
        private int rating;
        @JsonField(name = "description")
        private String description;
        private String language;
        private boolean wishlistAvailable;
        @JsonField(name = "jb_info")
        private JbInfoBean jb_info;
        private List<CityWhStockBean> city_wh_stock;

        public boolean isPrimus() {
            return primus;
        }

        public void setPrimus(boolean primus) {
            this.primus = primus;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isWishlistAvailable() {
            return wishlistAvailable;
        }

        public void setWishlistAvailable(boolean wishlistAvailable) {
            this.wishlistAvailable = wishlistAvailable;
        }

        public JbInfoBean getJb_info() {
            return jb_info;
        }

        public void setJb_info(JbInfoBean jb_info) {
            this.jb_info = jb_info;
        }

        public List<CityWhStockBean> getCity_wh_stock() {
            return city_wh_stock;
        }

        public void setCity_wh_stock(List<CityWhStockBean> city_wh_stock) {
            this.city_wh_stock = city_wh_stock;
        }

        @JsonObject
        public static class JbInfoBean {
            /**
             * times_rented : 49
             * author : {"id":87921,"name":"DANIELIE STEEL"}
             * titleid : 613735
             * avg_reading_time : 7
             * title : CHILD'S PLAY
             * category : {"id":1,"name":"General"}
             */
            @JsonField(name = "times_rented")
            private int times_rented;
            @JsonField(name = "author")
            private AuthorBean author;
            @JsonField(name = "")
            private int titleid;
            @JsonField(name = "avg_reading_time")
            private int avg_reading_time;
            @JsonField(name = "title")
            private String title;
            @JsonField(name = "category")
            private CategoryBean category;

            public int getTimes_rented() {
                return times_rented;
            }

            public void setTimes_rented(int times_rented) {
                this.times_rented = times_rented;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public int getTitleid() {
                return titleid;
            }

            public void setTitleid(int titleid) {
                this.titleid = titleid;
            }

            public int getAvg_reading_time() {
                return avg_reading_time;
            }

            public void setAvg_reading_time(int avg_reading_time) {
                this.avg_reading_time = avg_reading_time;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            @JsonObject
            public static class AuthorBean {
                /**
                 * id : 87921
                 * name : DANIELIE STEEL
                 */

                private int id;
                @JsonField(name = "name")
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            @JsonObject
            public static class CategoryBean {
                /**
                 * id : 1
                 * name : General
                 */

                private int id;
                @JsonField(name = "name")
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        @JsonObject
        public static class CityWhStockBean {
            /**
             * 9 : 1
             * 20 : 2
             * 26 : 3
             */

            @SerializedName("9")
            private int _$9;
            @SerializedName("20")
            private int _$20;
            @SerializedName("26")
            private int _$26;

            public int get_$9() {
                return _$9;
            }

            public void set_$9(int _$9) {
                this._$9 = _$9;
            }

            public int get_$20() {
                return _$20;
            }

            public void set_$20(int _$20) {
                this._$20 = _$20;
            }

            public int get_$26() {
                return _$26;
            }

            public void set_$26(int _$26) {
                this._$26 = _$26;
            }
        }
    }
}
