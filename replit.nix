{ pkgs }: {
    deps = [
        pkgs.openjdk17-bootstrap
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}