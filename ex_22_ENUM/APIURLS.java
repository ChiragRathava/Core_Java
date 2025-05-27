package ex_22_ENUM;

enum APIURLS{
    katalon("https://katalog.com"),
    google("https://google.com");

    private String url;

    APIURLS(String url){
        this.url = url;
    }

    String geturl(){
        return this.url;
    }
}
