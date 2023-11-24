package bo.edu.ucb.minio;

import io.minio.MinioClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinioConfig {
    private final String accessKey = "minioadmin";
    private final String accessSecret = "minioadmin";
    private final String minioUrl = "http://localhost:9000";

    @Bean
    public MinioClient generateMinioClient() {
        return MinioClient.builder()
                .endpoint(minioUrl)
                .credentials(accessKey, accessSecret)
                .build();
    }
}
