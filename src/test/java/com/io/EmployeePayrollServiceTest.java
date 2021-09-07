package com.io;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Unit test for simple EmployeePayrollService.
 */
public class EmployeePayrollServiceTest
{
    private static String HOME = System.getProperty("user.home");
    private static String PLAY_PATH = "TempPlay";

    @Test
    public void givenPathWhenCheckedShouldConfirmIfExist() throws IOException {
        // check path exist
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));

        // delete path
        final Path playPath = Paths.get(HOME+"/"+PLAY_PATH);
        if(Files.exists(playPath)){
            FileUtils.deleteFiles(playPath.toFile());
        }
        Assert.assertTrue(Files.notExists(playPath));

        // create directory
        Files.createDirectories(playPath);
        Assert.assertTrue(Files.exists(playPath));

        // create file
        IntStream.range(1,10).forEach(count->{
            Path tempFile =Paths.get(playPath+"/temp"+count);
            Assert.assertTrue(Files.notExists(tempFile));
            try{
                Files.createFile(tempFile);
            }catch (IOException e){
                e.printStackTrace();
            }
            Assert.assertTrue(Files.exists(tempFile));
        });

        //List files, directories with extension
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out:: println);
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath,path->path.toFile().isFile() && path.toString().startsWith("temp")).forEach(System.out::println);
    }
}
