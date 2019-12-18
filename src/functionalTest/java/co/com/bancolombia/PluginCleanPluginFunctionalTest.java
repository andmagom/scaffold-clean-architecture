/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package co.com.bancolombia;


import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.GradleRunner;
import org.gradle.testkit.runner.TaskOutcome;
import org.junit.Test;


import java.io.*;
import java.nio.file.Files;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * A simple functional test for the 'co.com.bancolombia.greeting' plugin.
 */

public class PluginCleanPluginFunctionalTest {

    @Test public void canRunTaskCleanArchitectureWithOutParameters() throws IOException {

        String task = "cleanArchitecture";
        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('co.com.bancolombia.cleanArchitecture')" +
                        "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments(task);
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();
        // Verify the result
        assertTrue(new File("build/functionalTest/Readme.md").exists());
        assertTrue(new File("build/functionalTest/.gitignore").exists());
        assertTrue(new File("build/functionalTest/build.gradle").exists());
        assertTrue(new File("build/functionalTest/lombok.config").exists());
        assertTrue(new File("build/functionalTest/main.gradle").exists());
        assertTrue(new File("build/functionalTest/settings.gradle").exists());

        assertTrue(new File("build/functionalTest/infraestucture/driven-adapters/").exists());
        assertTrue(new File("build/functionalTest/infraestucture/entry-points").exists());
        assertTrue(new File("build/functionalTest/infraestucture/helpers").exists());

        assertTrue(new File("build/functionalTest/domain/model/src/main/java/co/com/bancolombia/model").exists());
        assertTrue(new File("build/functionalTest/domain/model/src/test/java/co/com/bancolombia/model").exists());
        assertTrue(new File("build/functionalTest/domain/model/build.gradle").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/src/main/java/co/com/bancolombia/usecase").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/src/test/java/co/com/bancolombia/usecase").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/build.gradle").exists());

        assertTrue(new File("build/functionalTest/applications/app-service/build.gradle").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/java/co/com/bancolombia/MainApplication.java").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/java/co/com/bancolombia/config").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/resources/application.yaml").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/resources/log4j2.properties").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/test/java/co/com/bancolombia").exists());

        assertEquals(result.task(":"+task).getOutcome(), TaskOutcome.SUCCESS);
    }

    @Test public void canRunTaskCleanArchitectureWithParameters() throws IOException {
        String task = "cleanArchitecture";
        String _package = "co.com.test";
        String projectName = "ProjectName";

        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('co.com.bancolombia.cleanArchitecture')" +
                        "}");

        // Run the build

        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments(task,"--name="+ projectName,"--package="+ _package);
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();
        // Verify the result
        assertTrue(result.getOutput().contains( projectName));
        assertTrue(result.getOutput().contains("Package: "+ _package));


        assertTrue(new File("build/functionalTest/Readme.md").exists());
        assertTrue(new File("build/functionalTest/.gitignore").exists());
        assertTrue(new File("build/functionalTest/build.gradle").exists());
        assertTrue(new File("build/functionalTest/lombok.config").exists());
        assertTrue(new File("build/functionalTest/main.gradle").exists());
        assertTrue(new File("build/functionalTest/settings.gradle").exists());

        assertTrue(new File("build/functionalTest/infraestucture/driven-adapters/").exists());
        assertTrue(new File("build/functionalTest/infraestucture/entry-points").exists());
        assertTrue(new File("build/functionalTest/infraestucture/helpers").exists());

        assertTrue(new File("build/functionalTest/domain/model/src/main/java/co/com/test/model").exists());
        assertTrue(new File("build/functionalTest/domain/model/src/test/java/co/com/test/model").exists());
        assertTrue(new File("build/functionalTest/domain/model/build.gradle").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/src/main/java/co/com/test/usecase").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/src/test/java/co/com/test/usecase").exists());
        assertTrue(new File("build/functionalTest/domain/usecase/build.gradle").exists());

        assertTrue(new File("build/functionalTest/applications/app-service/build.gradle").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/java/co/com/test/MainApplication.java").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/java/co/com/test/config").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/resources/application.yaml").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/main/resources/log4j2.properties").exists());
        assertTrue(new File("build/functionalTest/applications/app-service/src/test/java/co/com/test").exists());

        assertEquals(result.task(":"+task).getOutcome(), TaskOutcome.SUCCESS);
    }

    @Test public void canRunTaskGenerateModelWithParameters() throws Exception {

        String task = "generateModel";
        String modelName = "testModel";
        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('co.com.bancolombia.cleanArchitecture')" +
                        "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments(task,"--name="+ modelName);
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();
        assertTrue(new File("build/functionalTest/domain/model/src/main/java/co/com/bancolombia/model/testModel/gateways/TestModelRepository.java").exists());
        assertTrue(new File("build/functionalTest/domain/model/src/main/java/co/com/bancolombia/model/testModel/TestModel.java").exists());

        assertEquals(result.task(":"+task).getOutcome(), TaskOutcome.SUCCESS);
    }

    @Test public void canRunTaskvalidateStructureWithOutParameters() throws IOException {
        canRunTaskCleanArchitectureWithOutParameters();
        String task = "validateStructure";
        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('co.com.bancolombia.cleanArchitecture')" +
                        "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments(task);
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();

        // Verify the result

        assertEquals(result.task(":"+task).getOutcome(), TaskOutcome.SUCCESS);
    }

    @Test public void createTasks() throws IOException {
        // Setup the test build
        File projectDir = new File("build/functionalTest");
        Files.createDirectories(projectDir.toPath());
        writeString(new File(projectDir, "settings.gradle"), "");
        writeString(new File(projectDir, "build.gradle"),
                "plugins {" +
                        "  id('co.com.bancolombia.cleanArchitecture')" +
                        "}");

        // Run the build
        GradleRunner runner = GradleRunner.create();
        runner.forwardOutput();
        runner.withPluginClasspath();
        runner.withArguments("tasks");
        runner.withProjectDir(projectDir);
        BuildResult result = runner.build();

        // Verify the result
        assertTrue(result.getOutput().contains("cleanArchitecture"));
        assertTrue(result.getOutput().contains("generateModel"));
        assertTrue(result.getOutput().contains("validateStructure"));

        assertEquals(result.task(":tasks").getOutcome(), TaskOutcome.SUCCESS);
    }

    private void writeString(File file, String string) throws IOException {
        try (Writer writer = new FileWriter(file)) {
            writer.write(string);
        }
    }


}
