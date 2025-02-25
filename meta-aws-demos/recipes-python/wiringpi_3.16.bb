LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/phylax2020/WiringPi.git;protocol=https;branch=master"

DEPENDS += "libgcrypt"

SRCREV = "2f35ff5ec84b41ae2b249f87edec589f87dc30ab"

S = "${WORKDIR}/git"

do_compile () {
	oe_runmake -C wiringPi all
}

do_install () {
	install -d	${D}${includedir}
	install wiringPi/*.h ${D}${includedir}
	install -d	${D}${libdir}
	install wiringPi/libwiringPi.so.${PV} ${D}${libdir}/
	ln -rs ${D}${libdir}/libwiringPi.so.${PV} ${D}${libdir}/libwiringPi.so
}

INSANE_SKIP:${PN}-dev += "dev-elf"
INSANE_SKIP:${PN}-dev += "ldflags"
INSANE_SKIP:${PN} += "ldflags"
