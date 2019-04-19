package ffmepg;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-04-19 12:48
 */
@SuppressWarnings("all")
public class VideoSeparationBGM {

    private String ffmpegEXE;

    public VideoSeparationBGM(String ffmpegEXE) {
        super();
        this.ffmpegEXE = ffmpegEXE;
    }

    public void convertor(String videoInputPath, String mp3InputPath) throws Exception {
//		ffmpeg.exe -i 苏州大裤衩.mp4 -i bgm.mp3 -t 7 -y 新的视频.mp4
        List<String> command = new ArrayList<>();
        command.add(ffmpegEXE);

        command.add("-i");
        command.add(videoInputPath);
        command.add("-vn");
        command.add("-y");
        command.add("-acodec");
        command.add("copy");
        command.add(mp3InputPath);

//		for (String c : command) {
//			System.out.print(c + " ");
//		}

        ProcessBuilder builder = new ProcessBuilder(command);
        Process process = builder.start();

        InputStream errorStream = process.getErrorStream();
        InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        String line = "";
        while ((line = br.readLine()) != null) {
        }

        if (br != null) {
            br.close();
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (errorStream != null) {
            errorStream.close();
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        VideoSeparationBGM ffmpeg = new VideoSeparationBGM("C:\\ffmpeg\\bin\\ffmpeg.exe");
        try {
            ffmpeg.convertor("C:\\Users\\Shinelon\\Desktop\\it_video\\video\\这是通过java生产的视频2.mp4", "C:\\Users\\Shinelon\\Desktop\\it_video\\BGM\\music1233.aac");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
