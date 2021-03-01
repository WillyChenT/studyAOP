import org.ming.sp.domain.Video;
import org.ming.sp.domain.Video2;
import org.ming.sp.domain.VideoOrder;
import org.ming.sp.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //掃描指定包，包過子包
        context.scan("org.ming.sp");

        //裡面是完成初始化操作，核心方法
        context.refresh();

        VideoService videoService = (VideoService) context.getBean("videoService");
        videoService.findById(2);

        Video video = (Video) context.getBean("video");
        video.init();
    }

}