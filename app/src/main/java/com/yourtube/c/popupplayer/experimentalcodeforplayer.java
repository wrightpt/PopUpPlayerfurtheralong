package com.yourtube.c.popupplayer;

/**
 * Created by c on 3/3/16.
 */
public class experimentalcodeforplayer {

   // String customHtml = "";

  //  String video; // = "<iframe src=\"http://www.youtube.com/embed/" + "dRvIiIVoVNw" + "\" width=\"100%\" height=\""+ 320 +"px\" frameborder=\"0\"></iframe>";

  String  video = "<div id=\"player\"></div>" +
            "    <script>" +
            "      var tag = document.createElement('script');" +
            "      tag.src = \"https://www.youtube.com/iframe_api\";" +
            "      var firstScriptTag = document.getElementsByTagName('script')[0];" +
            "      firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);" +
            "      var player;" +
            "      function onYouTubeIframeAPIReady() {" +
            "        player = new YT.Player('player', {" +
            "          height: '390'," +
            "          width: '640'," +
            "          videoId: 'dRvIiIVoVNw'," +
            "          events: {" +
            "            'onReady': onPlayerReady," +
            "            'onStateChange': onPlayerStateChange" +
            "          }" +
            "        });" +
            "      }" +
            "      function onPlayerReady(event) {" +
            "        event.target.playVideo();" +
            "      }" +
            "      var done = false;" +
            "      function onPlayerStateChange(event) {" +
            "        if (event.data == YT.PlayerState.PLAYING && !done) {" +
            "          setTimeout(stopVideo, 6000);" +
            "          done = true;" +
            "        }" +
            "      }" +
            "      function stopVideo() {" +
            "        player.stopVideo();" +
            "      }" +
            "    </script>";

 String  customHtml = "<html>" + "<body>"
                    /*add the video here*/
            + video
    + "<b><font size=\""
            + 5 + "\">"
            //+ "<div id='wrap'>"
            + "Test title"
            + "</font></b>"
            + "<font size=\"" + 3 + "\"><br><br><i>Detail1: " + "Test" + "<br/>" + "new_date" + "<br />Detail2: "+ "Test" +"</i></font><br><br>"
            + "<font size=\"" + 3 + "\">"
            + "Detail content" + "</font>"
            + "<br><br><br></body></html>";


}
