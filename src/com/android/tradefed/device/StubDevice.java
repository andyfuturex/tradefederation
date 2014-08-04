/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.tradefed.device;

import com.android.ddmlib.AdbCommandRejectedException;
import com.android.ddmlib.Client;
import com.android.ddmlib.FileListingService;
import com.android.ddmlib.IDevice;
import com.android.ddmlib.IShellOutputReceiver;
import com.android.ddmlib.InstallException;
import com.android.ddmlib.RawImage;
import com.android.ddmlib.ScreenRecorderOptions;
import com.android.ddmlib.ShellCommandUnresponsiveException;
import com.android.ddmlib.SyncException;
import com.android.ddmlib.SyncService;
import com.android.ddmlib.TimeoutException;
import com.android.ddmlib.log.LogReceiver;
import com.google.common.util.concurrent.SettableFuture;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Stub placeholder implementation of a {@link IDevice}.
 */
public class StubDevice implements IDevice {

    private final String mSerial;
    private final boolean mIsEmulator;

    public StubDevice(String serial) {
        this(serial, false);
    }

    StubDevice(String serial, boolean isEmulator) {
        mSerial = serial;
        mIsEmulator = isEmulator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createForward(int localPort, int remotePort) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeShellCommand(String command, IShellOutputReceiver receiver)
            throws TimeoutException, AdbCommandRejectedException,
            ShellCommandUnresponsiveException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Deprecated
    @Override
    public void executeShellCommand(String command, IShellOutputReceiver receiver,
            int maxTimeToOutputResponse) throws TimeoutException, AdbCommandRejectedException,
            ShellCommandUnresponsiveException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAvdName() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Client getClient(String applicationName) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getClientName(int pid) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Client[] getClients() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileListingService getFileListingService() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMountPoint(String name) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, String> getProperties() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getProperty(String name) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPropertyCount() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RawImage getScreenshot() throws TimeoutException, AdbCommandRejectedException,
            IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSerialNumber() {
        return mSerial;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviceState getState() {
        return DeviceState.OFFLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncService getSyncService() throws TimeoutException, AdbCommandRejectedException,
            IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasClients() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String installPackage(String packageFilePath, boolean reinstall, String... extraArgs)
            throws InstallException {
        throw new InstallException(new IOException("stub"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String installRemotePackage(String remoteFilePath, boolean reinstall,
            String... extraArgs) throws InstallException {
        throw new InstallException(new IOException("stub"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isBootLoader() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmulator() {
        return mIsEmulator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isOffline() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isOnline() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reboot(String into) throws TimeoutException, AdbCommandRejectedException,
            IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeForward(int localPort, int remotePort) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeRemotePackage(String remoteFilePath) throws InstallException {
        throw new InstallException(new IOException("stub"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void runEventLogService(LogReceiver receiver) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void runLogService(String logname, LogReceiver receiver) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String syncPackageToDevice(String localFilePath) throws TimeoutException,
            AdbCommandRejectedException, IOException, SyncException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String uninstallPackage(String packageName) throws InstallException {
        throw new InstallException(new IOException("stub"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void pushFile(String local, String remote) throws IOException,
            AdbCommandRejectedException, TimeoutException, SyncException {
        // ignore
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void pullFile(String remote, String local) throws IOException,
            AdbCommandRejectedException, TimeoutException, SyncException {
        // ignore
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPropertySync(String name) throws TimeoutException,
            AdbCommandRejectedException, ShellCommandUnresponsiveException, IOException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean arePropertiesSet() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPropertyCacheOrSync(String name) throws TimeoutException,
            AdbCommandRejectedException, ShellCommandUnresponsiveException, IOException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getBatteryLevel() throws TimeoutException, AdbCommandRejectedException,
            IOException, ShellCommandUnresponsiveException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getBatteryLevel(long freshnessMs) throws TimeoutException,
            AdbCommandRejectedException, IOException, ShellCommandUnresponsiveException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createForward(int localPort, String remoteSocketName,
            DeviceUnixSocketNamespace namespace) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        // ignore
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeForward(int localPort, String remoteSocketName,
            DeviceUnixSocketNamespace namespace) throws TimeoutException,
            AdbCommandRejectedException, IOException {
        // ignore
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeShellCommand(String command, IShellOutputReceiver receiver,
            long maxTimeToOutputResponse, TimeUnit maxTimeUnits)
            throws TimeoutException, AdbCommandRejectedException,
            ShellCommandUnresponsiveException, IOException {
        throw new IOException("stub");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supportsFeature(Feature feature) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void startScreenRecorder(String remoteFilePath, ScreenRecorderOptions options,
            IShellOutputReceiver receiver) throws TimeoutException, AdbCommandRejectedException,
            IOException, ShellCommandUnresponsiveException {
    }

    /* (non-Javadoc)
     * @see com.android.ddmlib.IDevice#supportsFeature(com.android.ddmlib.IDevice.HardwareFeature)
     */
    @Override
    public boolean supportsFeature(HardwareFeature arg0) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Future<String> getSystemProperty(String name) {
        SettableFuture<String> f = SettableFuture.create();
        f.set(null);
        return f;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Future<Integer> getBattery() {
        SettableFuture<Integer> f = SettableFuture.create();
        f.set(0);
        return f;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Future<Integer> getBattery(long freshnessTime, TimeUnit timeUnit) {
        return getBattery();
    }

    @Override
    public List<String> getAbis() {
        return Collections.emptyList();
    }

    @Override
    public int getDensity() {
        return 0;
    }
}
