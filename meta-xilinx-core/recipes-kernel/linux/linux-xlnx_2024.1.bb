LINUX_VERSION = "6.6.0"
YOCTO_META ?= "git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-6.6;destsuffix=yocto-kmeta"
KBRANCH="master"
SRCREV = "6379f64fc25832d93ad171056c554ec34bfc4e25"
SRCREV_meta = "5d0809d0d939c7738cb6e5391126c73fd0e4e865"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# Workaround for:
#  rm: cannot remove '.../tmp/work/zynqmp_generic-xilinx-linux/linux-xlnx/6.6.0-xilinx-v2024.1+gitAUTOINC+340eed5001-r0/image/lib/modules/6.6.0-xilinx-v2024.1-g340eed500130/source': No such file or directory
# This will not be required Scarthgap
kernel_do_install:prepend () {
	mkdir -p "${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}"
	touch "${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/source"
}
