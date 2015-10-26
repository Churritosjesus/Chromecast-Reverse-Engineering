.class final Laux;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "PG"


# instance fields
.field private synthetic a:Lauv;


# direct methods
.method constructor <init>(Lauv;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Laux;->a:Lauv;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    .prologue
    .line 110
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    aput-object v2, v0, v1

    .line 112
    return-void
.end method

.method public final onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4

    .prologue
    .line 118
    iget-object v0, p0, Laux;->a:Lauv;

    iget-object v0, v0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    .line 119
    if-nez p3, :cond_0

    .line 120
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    aput-object v3, v1, v2

    .line 121
    check-cast v0, Lawb;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    .line 2041
    iget-object v0, v0, Lawb;->b:Lawc;

    invoke-interface {v0, v1}, Lawc;->a([B)V

    .line 122
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-virtual {v0}, Lauv;->b()V

    .line 127
    :goto_0
    return-void

    .line 125
    :cond_0
    check-cast v0, Lawb;

    invoke-virtual {v0}, Lawb;->a()V

    goto :goto_0
.end method

.method public final onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 4

    .prologue
    .line 94
    iget-object v0, p0, Laux;->a:Lauv;

    iget-object v0, v0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    .line 95
    if-nez p3, :cond_0

    .line 96
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 97
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v3

    aput-object v3, v1, v2

    .line 98
    check-cast v0, Lawi;

    .line 1043
    iget-object v0, v0, Lawi;->c:Lavv;

    invoke-interface {v0}, Lavv;->b()V

    .line 99
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-virtual {v0}, Lauv;->b()V

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_0
    check-cast v0, Lawi;

    invoke-virtual {v0}, Lawi;->a()V

    goto :goto_0
.end method

.method public final onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    .prologue
    .line 133
    if-nez p2, :cond_1

    .line 134
    const/4 v0, 0x2

    if-ne p3, v0, :cond_0

    .line 136
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-virtual {v0}, Lauv;->b()V

    .line 146
    :goto_0
    return-void

    .line 138
    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 144
    :cond_1
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-static {v0}, Lauv;->a(Lauv;)V

    goto :goto_0
.end method

.method public final onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    .prologue
    .line 174
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 175
    iget-object v0, p0, Laux;->a:Lauv;

    iget-object v0, v0, Lauv;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavw;

    .line 4032
    iget-object v0, v0, Lavw;->b:Lavx;

    invoke-interface {v0, p2, p3}, Lavx;->a(II)V

    .line 178
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-virtual {v0}, Lauv;->b()V

    .line 179
    return-void
.end method

.method public final onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 152
    iget-object v0, p0, Laux;->a:Lauv;

    iget-object v0, v0, Lauv;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavu;

    .line 153
    if-nez p2, :cond_1

    .line 155
    iget-object v1, p0, Laux;->a:Lauv;

    iget-object v2, p0, Laux;->a:Lauv;

    .line 3024
    iget-object v2, v2, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    .line 155
    sget-object v3, Lavp;->v:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v2

    iput-object v2, v1, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    .line 156
    iget-object v1, p0, Laux;->a:Lauv;

    iget-object v1, v1, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    if-eqz v1, :cond_1

    .line 158
    iget-object v0, p0, Laux;->a:Lauv;

    iput-boolean v4, v0, Lauv;->c:Z

    .line 159
    iget-object v0, p0, Laux;->a:Lauv;

    .line 4024
    iget-object v0, v0, Lauv;->e:Landroid/os/Handler;

    .line 159
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 161
    invoke-virtual {p1, v4}, Landroid/bluetooth/BluetoothGatt;->requestConnectionPriority(I)Z

    .line 163
    :cond_0
    iget-object v0, p0, Laux;->a:Lauv;

    invoke-virtual {v0}, Lauv;->b()V

    .line 169
    :goto_0
    return-void

    .line 168
    :cond_1
    invoke-virtual {v0}, Lavu;->a()V

    goto :goto_0
.end method
