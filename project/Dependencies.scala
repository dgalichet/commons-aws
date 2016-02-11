import sbt._

object Dependencies {

  object V {
    val awsJavaSDK        = "1.10.50"
    val pellucidAwsWrap   = "0.8.0"
    val akkaStreamExt     = "0.9.0"
    val scalaTest         = "2.2.1"
    val postgresDriver    = "9.3-1102-jdbc4"
    val grizzled          = "1.0.2"
    val logback           = "1.1.1"
    val akka              = "2.3.4"
  }

  object Compile {
    val awsJavaSDK        = "com.amazonaws"       %   "aws-java-sdk"                  % V.awsJavaSDK
    val pellucidAwsWrap   = "com.github.dwhjames" %%  "aws-wrap"                      % V.pellucidAwsWrap
    val akkaStreamExt     = "com.mfglabs"         %%  "akka-stream-extensions"        % V.akkaStreamExt
    val akka              = "com.typesafe.akka"   %%  "akka-actor"                    % V.akka
    val grizzled          = "org.clapper"         %%  "grizzled-slf4j"                % V.grizzled
    val logback           = "ch.qos.logback"      %   "logback-classic"               % V.logback           % "runtime"
  }

  object Test {
    val scalaTest         = "org.scalatest"       %% "scalatest"            % V.scalaTest     % "test"
    val akkaTestkit      = "com.typesafe.akka"    %%  "akka-testkit"        % V.akka          % "test"
  }
}
