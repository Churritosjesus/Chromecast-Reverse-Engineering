.class public final Layf;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final e:Landroid/os/ParcelUuid;


# instance fields
.field public a:Layk;

.field private b:Landroid/bluetooth/BluetoothAdapter;

.field private c:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

.field private d:Landroid/bluetooth/le/ScanCallback;

.field private f:Ljava/util/ArrayList;

.field private g:I

.field private final h:Landroid/os/Handler;

.field private final i:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-string v0, "0000FEA0-0000-1000-8000-00805F9B34FB"

    .line 33
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Layf;->e:Landroid/os/ParcelUuid;

    .line 32
    return-void
.end method

.method static synthetic a(Layf;)Lblp;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Layf;->i:Lblp;

    return-object v0
.end method

.method static synthetic a(Layf;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/high16 v4, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    .line 2186
    iget-object v0, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2187
    iget v0, p0, Layf;->g:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Layf;->g:I

    .line 2188
    iget v0, p0, Layf;->g:I

    int-to-float v0, v0

    iget-object v1, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 2189
    new-array v0, v3, [Ljava/lang/Object;

    iget-object v1, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 2190
    iget-object v0, p0, Layf;->a:Layk;

    invoke-interface {v0}, Layk;->a()V

    .line 2196
    :cond_0
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    iget v1, p0, Layf;->g:I

    .line 2197
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    .line 2198
    new-array v0, v3, [Ljava/lang/Object;

    iget-object v1, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v2

    .line 25
    return-void

    .line 2193
    :cond_1
    iget-object v0, p0, Layf;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2194
    iget v0, p0, Layf;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Layf;->g:I

    goto :goto_0
.end method

.method static synthetic b(Layf;)Layk;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Layf;->a:Layk;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 5

    .prologue
    const-wide/16 v2, 0x2710

    .line 76
    iget-object v0, p0, Layf;->b:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_3

    iget-object v0, p0, Layf;->b:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 1134
    iget-object v0, p0, Layf;->a:Layk;

    if-eqz v0, :cond_0

    .line 1135
    new-instance v0, Layi;

    invoke-direct {v0, p0}, Layi;-><init>(Layf;)V

    iput-object v0, p0, Layf;->d:Landroid/bluetooth/le/ScanCallback;

    .line 1163
    iget-object v0, p0, Layf;->h:Landroid/os/Handler;

    new-instance v1, Layj;

    invoke-direct {v1, p0}, Layj;-><init>(Layf;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1172
    iget-object v0, p0, Layf;->b:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    .line 1173
    new-instance v1, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v1}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    const/4 v2, 0x2

    .line 1174
    invoke-virtual {v1, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    move-result-object v1

    .line 1175
    invoke-virtual {v1}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v1

    .line 1176
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1177
    new-instance v3, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v3}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    sget-object v4, Layf;->e:Landroid/os/ParcelUuid;

    .line 1178
    invoke-virtual {v3, v4}, Landroid/bluetooth/le/ScanFilter$Builder;->setServiceUuid(Landroid/os/ParcelUuid;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v3

    .line 1179
    invoke-virtual {v3}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v3

    .line 1180
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1181
    iget-object v3, p0, Layf;->d:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v0, v2, v1, v3}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    .line 80
    :cond_0
    const/4 v0, 0x1

    .line 85
    :goto_0
    return v0

    .line 2101
    :cond_1
    iget-object v0, p0, Layf;->a:Layk;

    if-eqz v0, :cond_2

    .line 2102
    new-instance v0, Layg;

    invoke-direct {v0, p0}, Layg;-><init>(Layf;)V

    iput-object v0, p0, Layf;->c:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    .line 2115
    :cond_2
    iget-object v0, p0, Layf;->h:Landroid/os/Handler;

    new-instance v1, Layh;

    invoke-direct {v1, p0}, Layh;-><init>(Layf;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2124
    iget-object v0, p0, Layf;->b:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Layf;->c:Landroid/bluetooth/BluetoothAdapter$LeScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->startLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z

    move-result v0

    goto :goto_0

    .line 85
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
