package ai.colbys.colbooru.repository

import io.minio.BucketExistsArgs
import io.minio.MakeBucketArgs
import io.minio.MinioClient
import io.minio.PutObjectArgs
import org.springframework.stereotype.Component
import java.io.InputStream

@Component
class ImageStorage(private val minioClient: MinioClient) {

    init {
        if (!minioClient.bucketExists(BucketExistsArgs.builder().bucket("images").build())) {
            minioClient.makeBucket(MakeBucketArgs.builder().bucket("images").build())
        }
    }

    fun get(uri: String) {

    }

    fun put(file: InputStream, contentType: String) {
        val result = minioClient.putObject(PutObjectArgs.builder()
            .bucket("images")
            .`object`("image object")
            .stream(file, -1, 10000000)
            .contentType(contentType)
            .build())
        println("duh")
    }

    fun delete() {

    }
}