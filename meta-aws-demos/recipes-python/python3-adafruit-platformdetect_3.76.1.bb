SUMMARY = "Platform detection for use by libraries like Adafruit-Blinka."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_PlatformDetect"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fccd531dce4b989c05173925f0bbb76c"

SRC_URI = "git://github.com/adafruit/Adafruit_Python_PlatformDetect.git;branch=main;protocol=https"
SRCREV = "49b677907ccb1509107937a135504fdf82faf3f5"
S = "${WORKDIR}/git"

inherit python_setuptools_build_meta python_pep517

DEPENDS += "python3-setuptools-scm-native"

RDEPENDS:${PN} += "python3-core"
