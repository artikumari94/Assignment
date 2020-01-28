package com.books.orders.model.response;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonObject
public class JustbookResponse {


    /**
     * status : true
     * statusMsg : null
     * successObject : {"content":[{"new_arrival":1,"author":"DANIELIE STEEL","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613735.jpg","isbn":"  9781529014761","title_id":"613735","description":"","onlineUsersStock":6,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"CHILD'S PLAY","primus":false,"rented":49,"books_query":"","recent_rented":49,"id":"AW_i_X-2zxhWqfCOobHO","author_id":87921,"category":1,"city_wh_stock":[{"9":1},{"20":2},{"26":3}],"stock":17},{"new_arrival":1,"author":" SHIVARAM RODDAM","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614511.jpg","isbn":"  9788192905808","title_id":"614511","description":"","onlineUsersStock":9,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"BHOOT AND BRUCE LEE","primus":false,"rented":2,"books_query":"","recent_rented":2,"id":"AW_jADl6zxhWqfCOod_-","author_id":311238,"category":1,"city_wh_stock":[{"9":1},{"16":1},{"26":7}],"stock":9},{"new_arrival":1,"author":"IRSHAD ABDULKADIR","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613552.jpg","isbn":"  9789389109054","title_id":"613552","description":"","onlineUsersStock":8,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"PRODIGAL","primus":false,"rented":4,"books_query":"","recent_rented":4,"id":"AW_i_NvZ_CIz_-hn4QCa","author_id":310935,"category":1,"city_wh_stock":[{"16":1},{"26":7}],"stock":8},{"new_arrival":1,"author":"PHILIPPA GREGORY","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613555.jpg","isbn":"  9781471172731","title_id":"613555","description":"","onlineUsersStock":7,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"TIDELANDS","primus":false,"rented":13,"books_query":"","recent_rented":13,"id":"AW_i_N8A_CIz_-hn4QDJ","author_id":1248,"category":1,"city_wh_stock":[{"26":7}],"stock":7},{"new_arrival":1,"author":"CAROLYN KEENE","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614384.jpg","isbn":"  9781534463127","title_id":"614384","description":"","onlineUsersStock":5,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"NANCY DREW FILES VOL. I: SECRETS CAN KILL; DEADLY INTENT; MURDER ON ICE","primus":false,"rented":17,"books_query":"","recent_rented":17,"id":"AW_i_8Z5zxhWqfCOodgM","author_id":1751,"category":34,"city_wh_stock":[{"9":1},{"26":4}],"stock":6},{"new_arrival":1,"author":"DURJOY DATTA","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613733.jpg","isbn":"  9780143448334","title_id":"613733","description":"","onlineUsersStock":5,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"WISH I COULD TELL YOU","primus":false,"rented":23,"books_query":"","recent_rented":23,"id":"AW_i_X4F_CIz_-hn4QuC","author_id":53006,"category":3,"city_wh_stock":[{"16":1},{"26":3}],"stock":6},{"new_arrival":1,"author":"LEE  CHILD","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614068.jpg","isbn":"  9781787630277","title_id":"614068","description":"","onlineUsersStock":6,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"BLUE MOON","primus":false,"rented":21,"books_query":"","recent_rented":21,"id":"AW_i_qkrzxhWqfCOocVQ","author_id":610,"category":5,"city_wh_stock":[{"9":1},{"16":1},{"20":1},{"26":3}],"stock":6},{"new_arrival":1,"author":"HAFSAH FAIZAL","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613176.jpg","isbn":"  9781529034097","title_id":"613176","description":"","onlineUsersStock":6,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"WE HUNT THE FLAME","primus":false,"rented":17,"books_query":"","recent_rented":17,"id":"AW_i8atG_CIz_-hn3-Xv","author_id":310798,"category":34,"city_wh_stock":[{"16":1},{"20":1},{"26":4}],"stock":6},{"new_arrival":1,"author":"VINEET BAJPAI","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614226.jpg","isbn":"  9789389237030","title_id":"614226","description":"","onlineUsersStock":6,"language":"HINDI","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"KASHI - KALE MANDIR KA RAHASYA (HINDI)","primus":false,"rented":3,"books_query":"","recent_rented":3,"id":"AW_i_zBL_CIz_-hn4SkA","author_id":76126,"category":27,"city_wh_stock":[{"9":1},{"26":5}],"stock":6},{"new_arrival":1,"author":"CHETAN BHAGAT","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/610190.jpg","isbn":"  9781542044165","title_id":"610190","description":"","onlineUsersStock":4,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"INDIA POSITIVE: NEW ESSAYS AND SELECTED COLUMNS","primus":false,"rented":113,"books_query":"","recent_rented":53,"id":"AW_i8tyS_CIz_-hn4Anh","author_id":350,"category":1,"city_wh_stock":[{"16":1},{"20":1},{"26":2}],"stock":5},{"new_arrival":1,"author":"ROBIN COOK","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614385.jpg","isbn":"  9781529019124","title_id":"614385","description":"","onlineUsersStock":5,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"GENESIS","primus":false,"rented":16,"books_query":"","recent_rented":16,"id":"AW_i_8eTzxhWqfCOodga","author_id":689,"category":1,"city_wh_stock":[{"9":1},{"16":1},{"20":1},{"26":2}],"stock":5},{"new_arrival":1,"author":"DAVID BALDACCI","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614175.jpg","isbn":"  9781509874460","title_id":"614175","description":"","onlineUsersStock":4,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"A MINUTE TO MIDNIGHT","primus":false,"rented":28,"books_query":"","recent_rented":28,"id":"AW_i_wjp_CIz_-hn4SZt","author_id":251,"category":5,"city_wh_stock":[{"9":1},{"26":3}],"stock":4},{"new_arrival":1,"author":"SHASHI THAROOR","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613174.jpg","isbn":"  9789388292856","title_id":"613174","description":"","onlineUsersStock":4,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"THE HINDU WAY: AN INTRODUCTION TO HINDUISM","primus":false,"rented":61,"books_query":"","recent_rented":61,"id":"AW_i8ai3_CIz_-hn3-WT","author_id":3159,"category":1,"city_wh_stock":[{"9":1},{"16":1},{"26":2}],"stock":4},{"new_arrival":1,"author":"RR RUSSELL","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614086.jpg","isbn":"  9781471173363","title_id":"614086","description":"","onlineUsersStock":4,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"DORK DIARIES: SPECTACULAR SUPERSTAR","primus":false,"rented":40,"books_query":"","recent_rented":40,"id":"AW_i_rePzxhWqfCOocY-","author_id":121544,"category":35,"city_wh_stock":[{"26":4}],"stock":4},{"new_arrival":1,"author":"DANIELIE STEEL","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/614174.jpg","isbn":"  9781529014808","title_id":"614174","description":"","onlineUsersStock":4,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"SPY","primus":false,"rented":26,"books_query":"","recent_rented":26,"id":"AW_i_wfp_CIz_-hn4SZc","author_id":87921,"category":3,"city_wh_stock":[{"20":1},{"26":3}],"stock":4},{"new_arrival":1,"author":"TT SUTHERLAND","image_url":"https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/610816.jpg","isbn":"  9789352756919","title_id":"610816","description":"","onlineUsersStock":1,"language":"English","primusNewArrival":false,"wish_list":0,"wishlistAvailable":false,"title":"WINGS OF FIRE 11: THE LOST CONTINENT","primus":false,"rented":8,"books_query":"","recent_rented":7,"id":"AW_i9edEzxhWqfCOoQVf","author_id":133105,"category":34,"city_wh_stock":[{"26":1}],"stock":1}]}
     * errorDescription : null
     * nextPageIsAvailable : false
     */
    @JsonField(name = "status")
    private boolean status;
    @JsonField(name = "statusMsg")
    private Object statusMsg;
    @JsonField(name = "successObject")
    private SuccessObjectBean successObject;
    @JsonField(name = "errorDescription")
    private Object errorDescription;
    @JsonField(name = "nextPageIsAvailable")
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
        @JsonField(name = "content")
        private List<ContentBean> content;

        public List<ContentBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBean> content) {
            this.content = content;
        }
        @JsonObject
        public static class ContentBean {
            /**
             * new_arrival : 1
             * author : DANIELIE STEEL
             * image_url : https://s3.ap-south-1.amazonaws.com/assets.jbclc.com/images/titles/613735.jpg
             * isbn :   9781529014761
             * title_id : 613735
             * description :
             * onlineUsersStock : 6
             * language : English
             * primusNewArrival : false
             * wish_list : 0
             * wishlistAvailable : false
             * title : CHILD'S PLAY
             * primus : false
             * rented : 49
             * books_query :
             * recent_rented : 49
             * id : AW_i_X-2zxhWqfCOobHO
             * author_id : 87921
             * category : 1
             * city_wh_stock : [{"9":1},{"20":2},{"26":3}]
             * stock : 17
             */

            private int new_arrival;
            @JsonField(name = "author")
            private String author;
            @JsonField(name = "image_url")
            private String image_url;
            private String isbn;
            @JsonField(name = "title_id")
            private String title_id;
            private String description;
            private int onlineUsersStock;
            private String language;
            private boolean primusNewArrival;
            private int wish_list;
            private boolean wishlistAvailable;
            @JsonField(name = "title")
            private String title;
            private boolean primus;
            private int rented;
            private String books_query;
            private int recent_rented;
            private String id;
            private int author_id;
            private int category;
            private int stock;
            private List<CityWhStockBean> city_wh_stock;

            public int getNew_arrival() {
                return new_arrival;
            }

            public void setNew_arrival(int new_arrival) {
                this.new_arrival = new_arrival;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getIsbn() {
                return isbn;
            }

            public void setIsbn(String isbn) {
                this.isbn = isbn;
            }

            public String getTitle_id() {
                return title_id;
            }

            public void setTitle_id(String title_id) {
                this.title_id = title_id;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getOnlineUsersStock() {
                return onlineUsersStock;
            }

            public void setOnlineUsersStock(int onlineUsersStock) {
                this.onlineUsersStock = onlineUsersStock;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public boolean isPrimusNewArrival() {
                return primusNewArrival;
            }

            public void setPrimusNewArrival(boolean primusNewArrival) {
                this.primusNewArrival = primusNewArrival;
            }

            public int getWish_list() {
                return wish_list;
            }

            public void setWish_list(int wish_list) {
                this.wish_list = wish_list;
            }

            public boolean isWishlistAvailable() {
                return wishlistAvailable;
            }

            public void setWishlistAvailable(boolean wishlistAvailable) {
                this.wishlistAvailable = wishlistAvailable;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public boolean isPrimus() {
                return primus;
            }

            public void setPrimus(boolean primus) {
                this.primus = primus;
            }

            public int getRented() {
                return rented;
            }

            public void setRented(int rented) {
                this.rented = rented;
            }

            public String getBooks_query() {
                return books_query;
            }

            public void setBooks_query(String books_query) {
                this.books_query = books_query;
            }

            public int getRecent_rented() {
                return recent_rented;
            }

            public void setRecent_rented(int recent_rented) {
                this.recent_rented = recent_rented;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(int author_id) {
                this.author_id = author_id;
            }

            public int getCategory() {
                return category;
            }

            public void setCategory(int category) {
                this.category = category;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public List<CityWhStockBean> getCity_wh_stock() {
                return city_wh_stock;
            }

            public void setCity_wh_stock(List<CityWhStockBean> city_wh_stock) {
                this.city_wh_stock = city_wh_stock;
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
}
