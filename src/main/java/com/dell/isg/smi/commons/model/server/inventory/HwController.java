/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.10 at 02:30:44 PM CST 
//

package com.dell.isg.smi.commons.model.server.inventory;

/**
 * The Class HwController.
 */
public class HwController {

    public HwController() {
        super();
    }

    protected long id;

    protected String bus = null;
    protected String cacheSizeInMB = null;
    protected String cacheCadeCapability = null;
    protected String controllerFirmwareVersion = null;
    protected String device = null;
    protected String deviceCardDataBusWidth = null;
    protected String deviceCardManufacturer = null;
    protected String deviceCardSlotLength = null;
    protected String deviceCardSlotType = null;
    protected String deviceDescription = null;
    protected String driverVersion = null;
    protected String encryptionCapability = null;
    protected String encryptionMode = null;
    protected String fQDD = null;
    protected String function = null;
    protected String instanceID = null;
    protected String keyID = null;
    protected String lastSystemInventoryTime = null;
    protected String lastUpdateTime = null;
    protected String maxAvailablePciLinkSpeed = null;
    protected String maxPossiblePciLinkSpeed = null;
    protected String PCIDeviceID = null;
    protected String PCISlot = null;
    protected String PCISubDeviceID = null;
    protected String PCISubVendorID = null;
    protected String PCIVendorID = null;
    protected String patrolReadState = null;
    protected String primaryStatus = null;
    protected String productName = null;
    protected String realtimeCapability = null;
    protected String rollUpStatus = null;
    protected String SASAddress = null;
    protected String securityStatus = null;
    protected String slicedVDCapability = null;
    protected String supportControllerBootMode = null;
    protected String supportEnhancedAutoForeignImport = null;
    protected String supportRaid10UnevenSpans = null;
    protected String t10piCapability = null;
    protected String possibleSpeed;
    protected String patrolReadMode;
    protected String ccMode;
    protected String ccRate;
    protected String copyBackMode;
    protected String bgiRate;
    protected String rebuildRate;
    protected String batteryState;
    protected String preservedCache;
    protected String batteryStatus;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the bus.
     *
     * @return the bus
     */
    public String getBus() {
        return bus;
    }


    /**
     * Sets the bus.
     *
     * @param bus the new bus
     */
    public void setBus(String bus) {
        this.bus = bus;
    }


    /**
     * Gets the cache size in MB.
     *
     * @return the cache size in MB
     */
    public String getCacheSizeInMB() {
        return cacheSizeInMB;
    }


    /**
     * Sets the cache size in MB.
     *
     * @param cacheSizeInMB the new cache size in MB
     */
    public void setCacheSizeInMB(String cacheSizeInMB) {
        this.cacheSizeInMB = cacheSizeInMB;
    }


    /**
     * Gets the cache cade capability.
     *
     * @return the cache cade capability
     */
    public String getCacheCadeCapability() {
        return cacheCadeCapability;
    }


    /**
     * Sets the cache cade capability.
     *
     * @param cacheCadeCapability the new cache cade capability
     */
    public void setCacheCadeCapability(String cacheCadeCapability) {
        this.cacheCadeCapability = cacheCadeCapability;
    }


    /**
     * Gets the controller firmware version.
     *
     * @return the controller firmware version
     */
    public String getControllerFirmwareVersion() {
        return controllerFirmwareVersion;
    }


    /**
     * Sets the controller firmware version.
     *
     * @param controllerFirmwareVersion the new controller firmware version
     */
    public void setControllerFirmwareVersion(String controllerFirmwareVersion) {
        this.controllerFirmwareVersion = controllerFirmwareVersion;
    }


    /**
     * Gets the device.
     *
     * @return the device
     */
    public String getDevice() {
        return device;
    }


    /**
     * Sets the device.
     *
     * @param device the new device
     */
    public void setDevice(String device) {
        this.device = device;
    }


    /**
     * Gets the device card data bus width.
     *
     * @return the device card data bus width
     */
    public String getDeviceCardDataBusWidth() {
        return deviceCardDataBusWidth;
    }


    /**
     * Sets the device card data bus width.
     *
     * @param deviceCardDataBusWidth the new device card data bus width
     */
    public void setDeviceCardDataBusWidth(String deviceCardDataBusWidth) {
        this.deviceCardDataBusWidth = deviceCardDataBusWidth;
    }


    /**
     * Gets the device card manufacturer.
     *
     * @return the device card manufacturer
     */
    public String getDeviceCardManufacturer() {
        return deviceCardManufacturer;
    }


    /**
     * Sets the device card manufacturer.
     *
     * @param deviceCardManufacturer the new device card manufacturer
     */
    public void setDeviceCardManufacturer(String deviceCardManufacturer) {
        this.deviceCardManufacturer = deviceCardManufacturer;
    }


    /**
     * Gets the device card slot length.
     *
     * @return the device card slot length
     */
    public String getDeviceCardSlotLength() {
        return deviceCardSlotLength;
    }


    /**
     * Sets the device card slot length.
     *
     * @param deviceCardSlotLength the new device card slot length
     */
    public void setDeviceCardSlotLength(String deviceCardSlotLength) {
        this.deviceCardSlotLength = deviceCardSlotLength;
    }


    /**
     * Gets the device card slot type.
     *
     * @return the device card slot type
     */
    public String getDeviceCardSlotType() {
        return deviceCardSlotType;
    }


    /**
     * Sets the device card slot type.
     *
     * @param deviceCardSlotType the new device card slot type
     */
    public void setDeviceCardSlotType(String deviceCardSlotType) {
        this.deviceCardSlotType = deviceCardSlotType;
    }


    /**
     * Gets the device description.
     *
     * @return the device description
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }


    /**
     * Sets the device description.
     *
     * @param deviceDescription the new device description
     */
    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }


    /**
     * Gets the driver version.
     *
     * @return the driver version
     */
    public String getDriverVersion() {
        return driverVersion;
    }


    /**
     * Sets the driver version.
     *
     * @param driverVersion the new driver version
     */
    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }


    /**
     * Gets the encryption capability.
     *
     * @return the encryption capability
     */
    public String getEncryptionCapability() {
        return encryptionCapability;
    }


    /**
     * Sets the encryption capability.
     *
     * @param encryptionCapability the new encryption capability
     */
    public void setEncryptionCapability(String encryptionCapability) {
        this.encryptionCapability = encryptionCapability;
    }


    /**
     * Gets the encryption mode.
     *
     * @return the encryption mode
     */
    public String getEncryptionMode() {
        return encryptionMode;
    }


    /**
     * Sets the encryption mode.
     *
     * @param encryptionMode the new encryption mode
     */
    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }


    public String getfQDD() {
        return fQDD;
    }


    public void setfQDD(String fQDD) {
        this.fQDD = fQDD;
    }


    /**
     * Gets the function.
     *
     * @return the function
     */
    public String getFunction() {
        return function;
    }


    /**
     * Sets the function.
     *
     * @param function the new function
     */
    public void setFunction(String function) {
        this.function = function;
    }


    /**
     * Gets the instance ID.
     *
     * @return the instance ID
     */
    public String getInstanceID() {
        return instanceID;
    }


    /**
     * Sets the instance ID.
     *
     * @param instanceID the new instance ID
     */
    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }


    /**
     * Gets the key ID.
     *
     * @return the key ID
     */
    public String getKeyID() {
        return keyID;
    }


    /**
     * Sets the key ID.
     *
     * @param keyID the new key ID
     */
    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }


    /**
     * Gets the last system inventory time.
     *
     * @return the last system inventory time
     */
    public String getLastSystemInventoryTime() {
        return lastSystemInventoryTime;
    }


    /**
     * Sets the last system inventory time.
     *
     * @param lastSystemInventoryTime the new last system inventory time
     */
    public void setLastSystemInventoryTime(String lastSystemInventoryTime) {
        this.lastSystemInventoryTime = lastSystemInventoryTime;
    }


    /**
     * Gets the last update time.
     *
     * @return the last update time
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }


    /**
     * Sets the last update time.
     *
     * @param lastUpdateTime the new last update time
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * Gets the max available pci link speed.
     *
     * @return the max available pci link speed
     */
    public String getMaxAvailablePciLinkSpeed() {
        return maxAvailablePciLinkSpeed;
    }


    /**
     * Sets the max available pci link speed.
     *
     * @param maxAvailablePciLinkSpeed the new max available pci link speed
     */
    public void setMaxAvailablePciLinkSpeed(String maxAvailablePciLinkSpeed) {
        this.maxAvailablePciLinkSpeed = maxAvailablePciLinkSpeed;
    }


    /**
     * Gets the max possible pci link speed.
     *
     * @return the max possible pci link speed
     */
    public String getMaxPossiblePciLinkSpeed() {
        return maxPossiblePciLinkSpeed;
    }


    /**
     * Sets the max possible pci link speed.
     *
     * @param maxPossiblePciLinkSpeed the new max possible pci link speed
     */
    public void setMaxPossiblePciLinkSpeed(String maxPossiblePciLinkSpeed) {
        this.maxPossiblePciLinkSpeed = maxPossiblePciLinkSpeed;
    }


    /**
     * Gets the PCI device ID.
     *
     * @return the PCI device ID
     */
    public String getPCIDeviceID() {
        return PCIDeviceID;
    }


    /**
     * Sets the PCI device ID.
     *
     * @param PCIDeviceID the new PCI device ID
     */
    public void setPCIDeviceID(String PCIDeviceID) {
        this.PCIDeviceID = PCIDeviceID;
    }


    /**
     * Gets the PCI slot.
     *
     * @return the PCI slot
     */
    public String getPCISlot() {
        return PCISlot;
    }


    /**
     * Sets the PCI slot.
     *
     * @param PCISlot the new PCI slot
     */
    public void setPCISlot(String PCISlot) {
        this.PCISlot = PCISlot;
    }


    /**
     * Gets the PCI sub device ID.
     *
     * @return the PCI sub device ID
     */
    public String getPCISubDeviceID() {
        return PCISubDeviceID;
    }


    /**
     * Sets the PCI sub device ID.
     *
     * @param PCISubDeviceID the new PCI sub device ID
     */
    public void setPCISubDeviceID(String PCISubDeviceID) {
        this.PCISubDeviceID = PCISubDeviceID;
    }


    /**
     * Gets the PCI sub vendor ID.
     *
     * @return the PCI sub vendor ID
     */
    public String getPCISubVendorID() {
        return PCISubVendorID;
    }


    /**
     * Sets the PCI sub vendor ID.
     *
     * @param PCISubVendorID the new PCI sub vendor ID
     */
    public void setPCISubVendorID(String PCISubVendorID) {
        this.PCISubVendorID = PCISubVendorID;
    }


    /**
     * Gets the PCI vendor ID.
     *
     * @return the PCI vendor ID
     */
    public String getPCIVendorID() {
        return PCIVendorID;
    }


    /**
     * Sets the PCI vendor ID.
     *
     * @param PCIVendorID the new PCI vendor ID
     */
    public void setPCIVendorID(String PCIVendorID) {
        this.PCIVendorID = PCIVendorID;
    }


    /**
     * Gets the patrol read state.
     *
     * @return the patrol read state
     */
    public String getPatrolReadState() {
        return patrolReadState;
    }


    /**
     * Sets the patrol read state.
     *
     * @param patrolReadState the new patrol read state
     */
    public void setPatrolReadState(String patrolReadState) {
        this.patrolReadState = patrolReadState;
    }


    /**
     * Gets the primary status.
     *
     * @return the primary status
     */
    public String getPrimaryStatus() {
        return primaryStatus;
    }


    /**
     * Sets the primary status.
     *
     * @param primaryStatus the new primary status
     */
    public void setPrimaryStatus(String primaryStatus) {
        this.primaryStatus = primaryStatus;
    }


    /**
     * Gets the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }


    /**
     * Sets the product name.
     *
     * @param productName the new product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * Gets the realtime capability.
     *
     * @return the realtime capability
     */
    public String getRealtimeCapability() {
        return realtimeCapability;
    }


    /**
     * Sets the realtime capability.
     *
     * @param realtimeCapability the new realtime capability
     */
    public void setRealtimeCapability(String realtimeCapability) {
        this.realtimeCapability = realtimeCapability;
    }


    /**
     * Gets the roll up status.
     *
     * @return the roll up status
     */
    public String getRollUpStatus() {
        return rollUpStatus;
    }


    /**
     * Sets the roll up status.
     *
     * @param rollUpStatus the new roll up status
     */
    public void setRollUpStatus(String rollUpStatus) {
        this.rollUpStatus = rollUpStatus;
    }


    /**
     * Gets the SAS address.
     *
     * @return the SAS address
     */
    public String getSASAddress() {
        return SASAddress;
    }


    /**
     * Sets the SAS address.
     *
     * @param SASAddress the new SAS address
     */
    public void setSASAddress(String SASAddress) {
        this.SASAddress = SASAddress;
    }


    /**
     * Gets the security status.
     *
     * @return the security status
     */
    public String getSecurityStatus() {
        return securityStatus;
    }


    /**
     * Sets the security status.
     *
     * @param securityStatus the new security status
     */
    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }


    /**
     * Gets the sliced VD capability.
     *
     * @return the sliced VD capability
     */
    public String getSlicedVDCapability() {
        return slicedVDCapability;
    }


    /**
     * Sets the sliced VD capability.
     *
     * @param slicedVDCapability the new sliced VD capability
     */
    public void setSlicedVDCapability(String slicedVDCapability) {
        this.slicedVDCapability = slicedVDCapability;
    }


    /**
     * Gets the support controller boot mode.
     *
     * @return the support controller boot mode
     */
    public String getSupportControllerBootMode() {
        return supportControllerBootMode;
    }


    /**
     * Sets the support controller boot mode.
     *
     * @param supportControllerBootMode the new support controller boot mode
     */
    public void setSupportControllerBootMode(String supportControllerBootMode) {
        this.supportControllerBootMode = supportControllerBootMode;
    }


    /**
     * Gets the support enhanced auto foreign import.
     *
     * @return the support enhanced auto foreign import
     */
    public String getSupportEnhancedAutoForeignImport() {
        return supportEnhancedAutoForeignImport;
    }


    /**
     * Sets the support enhanced auto foreign import.
     *
     * @param supportEnhancedAutoForeignImport the new support enhanced auto foreign import
     */
    public void setSupportEnhancedAutoForeignImport(String supportEnhancedAutoForeignImport) {
        this.supportEnhancedAutoForeignImport = supportEnhancedAutoForeignImport;
    }


    /**
     * Gets the support raid 10 uneven spans.
     *
     * @return the support raid 10 uneven spans
     */
    public String getSupportRaid10UnevenSpans() {
        return supportRaid10UnevenSpans;
    }


    /**
     * Sets the support raid 10 uneven spans.
     *
     * @param supportRaid10UnevenSpans the new support raid 10 uneven spans
     */
    public void setSupportRaid10UnevenSpans(String supportRaid10UnevenSpans) {
        this.supportRaid10UnevenSpans = supportRaid10UnevenSpans;
    }


    /**
     * Gets the t 10 pi capability.
     *
     * @return the t 10 pi capability
     */
    public String getT10piCapability() {
        return t10piCapability;
    }


    /**
     * Sets the t 10 pi capability.
     *
     * @param t10piCapability the new t 10 pi capability
     */
    public void setT10piCapability(String t10piCapability) {
        this.t10piCapability = t10piCapability;
    }


    /**
     * Gets the possible speed.
     *
     * @return the possible speed
     */
    public String getPossibleSpeed() {
        return possibleSpeed;
    }


    /**
     * Sets the possible speed.
     *
     * @param possibleSpeed the new possible speed
     */
    public void setPossibleSpeed(String possibleSpeed) {
        this.possibleSpeed = possibleSpeed;
    }


    /**
     * Gets the patrol read mode.
     *
     * @return the patrol read mode
     */
    public String getPatrolReadMode() {
        return patrolReadMode;
    }


    /**
     * Sets the patrol read mode.
     *
     * @param patrolReadMode the new patrol read mode
     */
    public void setPatrolReadMode(String patrolReadMode) {
        this.patrolReadMode = patrolReadMode;
    }


    /**
     * Gets the cc mode.
     *
     * @return the cc mode
     */
    public String getCcMode() {
        return ccMode;
    }


    /**
     * Sets the cc mode.
     *
     * @param ccMode the new cc mode
     */
    public void setCcMode(String ccMode) {
        this.ccMode = ccMode;
    }


    /**
     * Gets the cc rate.
     *
     * @return the cc rate
     */
    public String getCcRate() {
        return ccRate;
    }


    /**
     * Sets the cc rate.
     *
     * @param ccRate the new cc rate
     */
    public void setCcRate(String ccRate) {
        this.ccRate = ccRate;
    }


    /**
     * Gets the copy back mode.
     *
     * @return the copy back mode
     */
    public String getCopyBackMode() {
        return copyBackMode;
    }


    /**
     * Sets the copy back mode.
     *
     * @param copyBackMode the new copy back mode
     */
    public void setCopyBackMode(String copyBackMode) {
        this.copyBackMode = copyBackMode;
    }


    /**
     * Gets the bgi rate.
     *
     * @return the bgi rate
     */
    public String getBgiRate() {
        return bgiRate;
    }


    /**
     * Sets the bgi rate.
     *
     * @param bgiRate the new bgi rate
     */
    public void setBgiRate(String bgiRate) {
        this.bgiRate = bgiRate;
    }


    /**
     * Gets the rebuild rate.
     *
     * @return the rebuild rate
     */
    public String getRebuildRate() {
        return rebuildRate;
    }


    /**
     * Sets the rebuild rate.
     *
     * @param rebuildRate the new rebuild rate
     */
    public void setRebuildRate(String rebuildRate) {
        this.rebuildRate = rebuildRate;
    }


    /**
     * Gets the battery state.
     *
     * @return the battery state
     */
    public String getBatteryState() {
        return batteryState;
    }


    /**
     * Sets the battery state.
     *
     * @param batteryState the new battery state
     */
    public void setBatteryState(String batteryState) {
        this.batteryState = batteryState;
    }


    /**
     * Gets the preserved cache.
     *
     * @return the preserved cache
     */
    public String getPreservedCache() {
        return preservedCache;
    }


    /**
     * Sets the preserved cache.
     *
     * @param preservedCache the new preserved cache
     */
    public void setPreservedCache(String preservedCache) {
        this.preservedCache = preservedCache;
    }


    /**
     * Gets the battery status.
     *
     * @return the battery status
     */
    public String getBatteryStatus() {
        return batteryStatus;
    }


    /**
     * Sets the battery status.
     *
     * @param batteryStatus the new battery status
     */
    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}