SUMMARY = "A pure Python implementation of adafruit_pixelbuf"
HOMEPAGE = "https://github.com/adafruit/Adafruit_CircuitPython_Pixelbuf"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78a287ed9ac9062fc1aa26a863e5c39d"

SRC_URI = "git://github.com/adafruit/Adafruit_CircuitPython_Pixelbuf.git;branch=main;protocol=https"
SRCREV = "f21b005facc40d230c6462799573822563842f83"

S = "${WORKDIR}/git"

inherit python3native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
    install ${S}/adafruit_pixelbuf.py ${D}${PYTHON_SITEPACKAGES_DIR}/
}

FILES:${PN} += "\
    ${PYTHON_SITEPACKAGES_DIR}/* \
"
