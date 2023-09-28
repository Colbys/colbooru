package ai.colbys.colbooru.config

import io.minio.MinioClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class StorageConfig {

    @Bean
    fun minioClient(): MinioClient {
        return MinioClient.builder()
            .endpoint("http://localhost:9000")
            .credentials("colbooru_minio", "ZWTPvzARUTVc5FuMQUEeLQ")
            .build();
    }
}