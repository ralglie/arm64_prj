DESCRIPTION = "shared library libmsgtool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://libmsgtool.c \
           file://msgtool.h"

#inherit pkgconfig make#

S = "${WORKDIR}"

FILES_${PN} = "${libdir}/libmsgtool.so"
FILES_${PN}-dev = "${includedir}"

CFLAGS += "-fPIC -Wall -Wextra -O2 -g"
LDFLAGS = "-shared"

SOLIBS = "libmsgtool.so"
FILES_SOLIBSDEV = ""
INSANE_SKIP_${PN} += "dev-so"

do_compile(){
        ${CC} ${CFLAGS} ${LDFLAGS} -o libmsgtool.so libmsgtool.c
}

do_install() {
        install -d ${D}${libdir}
        install -m 0755 ${B}/libmsgtool.so ${D}${libdir}
        install -d ${D}${includedir}
        install -m 0755 ${S}/*.h ${D}${includedir}
}
     
