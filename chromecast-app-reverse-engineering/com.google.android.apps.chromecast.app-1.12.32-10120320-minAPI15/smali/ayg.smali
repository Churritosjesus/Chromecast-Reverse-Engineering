.class final Layg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# instance fields
.field private synthetic a:Layf;


# direct methods
.method constructor <init>(Layf;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Layg;->a:Layf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 105
    invoke-static {p3}, Lawd;->a([B)Lawd;

    move-result-object v3

    .line 2096
    iget-object v0, v3, Lawd;->b:Ljava/util/List;

    .line 1317
    sget-object v4, Lawd;->a:Landroid/os/ParcelUuid;

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 106
    :goto_0
    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Layg;->a:Layf;

    invoke-static {v0}, Layf;->a(Layf;)Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 108
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 109
    iget-object v0, p0, Layg;->a:Layf;

    invoke-static {v0}, Layf;->b(Layf;)Layk;

    move-result-object v0

    invoke-interface {v0, p1, v3}, Layk;->a(Landroid/bluetooth/BluetoothDevice;Lawd;)V

    .line 110
    iget-object v0, p0, Layg;->a:Layf;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Layf;->a(Layf;Ljava/lang/String;)V

    .line 112
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 1320
    goto :goto_0
.end method
