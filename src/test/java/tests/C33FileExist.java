package tests;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;


public class C33FileExist  {

    @Test
    void filetest(){
     boolean isexit=   Files.exists(Path.of("C:\\Users\\USER\\IdeaProjects\\sdaSelnuimMvnWrok1\\files\\test.txt"));
        System.out.println("isexit = " + isexit);
        assert isexit;

    }
}
