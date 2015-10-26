.class public final Lauv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field b:Landroid/bluetooth/BluetoothGatt;

.field public c:Z

.field public d:Landroid/bluetooth/BluetoothGattService;

.field final e:Landroid/os/Handler;

.field public final f:Ljava/util/LinkedList;

.field public final g:Ljava/util/LinkedList;

.field private final h:Landroid/bluetooth/BluetoothDevice;

.field private final i:Lblp;

.field private j:Landroid/content/Context;

.field private k:Z

.field private final l:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput v2, p0, Lauv;->a:I

    .line 36
    iput-boolean v2, p0, Lauv;->k:Z

    .line 37
    iput-boolean v2, p0, Lauv;->c:Z

    .line 41
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    .line 42
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lauv;->g:Ljava/util/LinkedList;

    .line 89
    new-instance v0, Laux;

    invoke-direct {v0, p0}, Laux;-><init>(Lauv;)V

    iput-object v0, p0, Lauv;->l:Landroid/bluetooth/BluetoothGattCallback;

    .line 46
    iput-object p1, p0, Lauv;->h:Landroid/bluetooth/BluetoothDevice;

    .line 47
    iput-object p2, p0, Lauv;->j:Landroid/content/Context;

    .line 48
    new-instance v0, Lblp;

    const-string v1, "BleConnectionManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lauv;->i:Lblp;

    .line 49
    iput-boolean v2, p0, Lauv;->k:Z

    .line 50
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lauv;->e:Landroid/os/Handler;

    .line 51
    return-void
.end method

.method static synthetic a(Lauv;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lauv;->c()V

    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 385
    const/4 v0, 0x0

    iput-boolean v0, p0, Lauv;->c:Z

    .line 386
    iget-object v0, p0, Lauv;->e:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 387
    iget v0, p0, Lauv;->a:I

    if-nez v0, :cond_1

    .line 388
    invoke-virtual {p0}, Lauv;->a()Z

    .line 404
    :cond_0
    :goto_0
    return-void

    .line 390
    :cond_1
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 391
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    .line 10023
    iget v1, v0, Lavr;->a:I

    .line 394
    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    if-nez v1, :cond_1

    .line 395
    :cond_2
    iput-object v3, p0, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    .line 397
    invoke-direct {p0, v0}, Lauv;->c(Lavr;)V

    .line 398
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 399
    iget-object v0, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    goto :goto_0
.end method

.method private c(Lavr;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 242
    iput-boolean v2, p0, Lauv;->k:Z

    .line 4023
    iget v0, p1, Lavr;->a:I

    .line 243
    packed-switch v0, :pswitch_data_0

    .line 265
    :cond_0
    :goto_0
    return-void

    .line 245
    :pswitch_0
    iget-object v0, p0, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_2

    .line 246
    check-cast p1, Lawi;

    .line 4273
    iget-object v0, p0, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    .line 5036
    iget-object v1, p1, Lawi;->d:Ljava/util/UUID;

    .line 4274
    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    .line 4275
    if-eqz v0, :cond_1

    .line 5054
    iget-object v1, p1, Lawi;->b:[B

    .line 4276
    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 4281
    iget-object v1, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4284
    invoke-virtual {p1}, Lawi;->a()V

    goto :goto_0

    .line 4278
    :cond_1
    invoke-virtual {p1}, Lawi;->a()V

    goto :goto_0

    .line 248
    :cond_2
    check-cast p1, Lawi;

    invoke-virtual {p1}, Lawi;->a()V

    goto :goto_0

    .line 252
    :pswitch_1
    iget-object v0, p0, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    if-eqz v0, :cond_4

    .line 253
    check-cast p1, Lawb;

    .line 5294
    iget-object v0, p0, Lauv;->d:Landroid/bluetooth/BluetoothGattService;

    .line 6034
    iget-object v1, p1, Lawb;->c:Ljava/util/UUID;

    .line 5295
    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    .line 5296
    if-eqz v0, :cond_3

    .line 5297
    iget-object v1, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5300
    new-array v0, v2, [Ljava/lang/Object;

    .line 7034
    iget-object v1, p1, Lawb;->c:Ljava/util/UUID;

    .line 5300
    aput-object v1, v0, v3

    .line 5301
    invoke-virtual {p1}, Lawb;->a()V

    goto :goto_0

    .line 5304
    :cond_3
    new-array v0, v2, [Ljava/lang/Object;

    .line 8034
    iget-object v1, p1, Lawb;->c:Ljava/util/UUID;

    .line 5304
    aput-object v1, v0, v3

    .line 5305
    invoke-virtual {p1}, Lawb;->a()V

    goto :goto_0

    .line 255
    :cond_4
    check-cast p1, Lawb;

    invoke-virtual {p1}, Lawb;->a()V

    goto :goto_0

    .line 259
    :pswitch_2
    check-cast p1, Lavw;

    .line 8315
    iget-object v0, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    .line 9046
    iget v1, p1, Lavw;->c:I

    .line 8315
    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->requestMtu(I)Z

    goto :goto_0

    .line 262
    :pswitch_3
    check-cast p1, Lavu;

    .line 9326
    iget-object v0, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9329
    invoke-virtual {p1}, Lavu;->a()V

    goto :goto_0

    .line 243
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final a(Lavr;)V
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 199
    iget-boolean v0, p0, Lauv;->k:Z

    if-nez v0, :cond_0

    .line 200
    invoke-virtual {p0}, Lauv;->b()V

    .line 202
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 58
    iget-object v2, p0, Lauv;->e:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 59
    iget-object v2, p0, Lauv;->e:Landroid/os/Handler;

    new-instance v3, Lauw;

    invoke-direct {v3, p0}, Lauw;-><init>(Lauv;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    iput-boolean v0, p0, Lauv;->k:Z

    .line 77
    iget-object v2, p0, Lauv;->h:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p0, Lauv;->j:Landroid/content/Context;

    iget-object v4, p0, Lauv;->l:Landroid/bluetooth/BluetoothGattCallback;

    invoke-virtual {v2, v3, v1, v4}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v2

    iput-object v2, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    .line 78
    iget-object v2, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    if-eqz v2, :cond_0

    .line 83
    :goto_0
    return v0

    .line 81
    :cond_0
    invoke-direct {p0}, Lauv;->c()V

    move v0, v1

    .line 83
    goto :goto_0
.end method

.method protected final b()V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 219
    new-array v3, v1, [Ljava/lang/Object;

    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    .line 1409
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1410
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    .line 2023
    iget v6, v0, Lavr;->a:I

    .line 1411
    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 1423
    :pswitch_0
    const-string v6, "Read on "

    check-cast v0, Lawb;

    .line 3034
    iget-object v0, v0, Lawb;->c:Ljava/util/UUID;

    .line 1424
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1423
    :goto_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1413
    :pswitch_1
    const-string v6, "Write on "

    check-cast v0, Lawi;

    .line 2036
    iget-object v0, v0, Lawi;->d:Ljava/util/UUID;

    .line 1414
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1413
    :goto_2
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1414
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 1417
    :pswitch_2
    const-string v0, "DiscoverServices"

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1420
    :pswitch_3
    check-cast v0, Lavw;

    .line 2046
    iget v0, v0, Lavw;->c:I

    .line 1420
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v7, 0x19

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "Change MTU to "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1424
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 1427
    :cond_2
    const-string v0, ", "

    invoke-static {v0, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 219
    aput-object v0, v3, v2

    .line 3188
    iget-object v0, p0, Lauv;->j:Landroid/content/Context;

    const-string v3, "bluetooth"

    .line 3189
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    .line 3190
    iget-object v3, p0, Lauv;->h:Landroid/bluetooth/BluetoothDevice;

    const/4 v4, 0x7

    invoke-virtual {v0, v3, v4}, Landroid/bluetooth/BluetoothManager;->getConnectionState(Landroid/bluetooth/BluetoothDevice;I)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lauv;->b:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_4

    move v0, v1

    .line 220
    :goto_3
    if-nez v0, :cond_5

    .line 221
    invoke-virtual {p0}, Lauv;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 222
    invoke-direct {p0}, Lauv;->c()V

    .line 236
    :cond_3
    :goto_4
    return-void

    :cond_4
    move v0, v2

    .line 3190
    goto :goto_3

    .line 224
    :cond_5
    iget-object v0, p0, Lauv;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 225
    iget-object v0, p0, Lauv;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    invoke-direct {p0, v0}, Lauv;->c(Lavr;)V

    goto :goto_4

    .line 226
    :cond_6
    iget-boolean v0, p0, Lauv;->c:Z

    if-nez v0, :cond_8

    .line 227
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_7

    .line 3348
    new-instance v0, Lavy;

    const/16 v1, 0x200

    new-instance v2, Lauy;

    invoke-direct {v2, p0}, Lauy;-><init>(Lauv;)V

    invoke-direct {v0, p0, v1, v2}, Lavy;-><init>(Lauv;ILawa;)V

    .line 3360
    invoke-virtual {v0}, Lavy;->a()V

    .line 3367
    :cond_7
    new-instance v0, Lavu;

    new-instance v1, Lauz;

    invoke-direct {v1, p0}, Lauz;-><init>(Lauv;)V

    invoke-direct {v0, v1}, Lavu;-><init>(Lavv;)V

    .line 230
    invoke-virtual {p0, v0}, Lauv;->b(Lavr;)V

    goto :goto_4

    .line 231
    :cond_8
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 232
    iget-object v0, p0, Lauv;->f:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lavr;

    invoke-direct {p0, v0}, Lauv;->c(Lavr;)V

    goto :goto_4

    .line 234
    :cond_9
    iput-boolean v2, p0, Lauv;->k:Z

    goto :goto_4

    .line 1411
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final b(Lavr;)V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lauv;->g:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 209
    iget-boolean v0, p0, Lauv;->k:Z

    if-nez v0, :cond_0

    .line 210
    invoke-virtual {p0}, Lauv;->b()V

    .line 212
    :cond_0
    return-void
.end method
