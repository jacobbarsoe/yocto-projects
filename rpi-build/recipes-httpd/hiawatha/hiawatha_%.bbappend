FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://hiawatha.conf"

do_install[postfuncs] += "do_install_overrideconf"

do_install_overrideconf() {
        install -m 0755 ${WORKDIR}/hiawatha.conf ${D}/${sysconfdir}/hiawatha/
}