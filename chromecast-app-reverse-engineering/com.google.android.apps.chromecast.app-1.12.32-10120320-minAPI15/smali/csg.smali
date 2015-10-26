.class final Lcsg;
.super Lcrp;


# instance fields
.field private final a:Lbwq;


# direct methods
.method public constructor <init>(Lbwq;)V
    .locals 0

    invoke-direct {p0}, Lcrp;-><init>()V

    iput-object p1, p0, Lcsg;->a:Lbwq;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;Landroid/os/ParcelFileDescriptor;Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v2, 0x3

    const/4 v5, 0x0

    .line 1000
    invoke-static {v2}, La;->b(I)Z

    move-result v0

    .line 0
    if-eqz v0, :cond_0

    const-string v0, "PeopleClient"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Avatar callback: status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " pfd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2000
    invoke-static {v2}, La;->b(I)Z

    .line 0
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Lcsa;->a(ILjava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    if-eqz p4, :cond_1

    const-string v0, "rewindable"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v0, "width"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v0, "height"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    :goto_0
    iget-object v6, p0, Lcsg;->a:Lbwq;

    new-instance v0, Lcsb;

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Lcsb;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;ZII)V

    invoke-interface {v6, v0}, Lbwq;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    move v4, v5

    move v3, v5

    goto :goto_0
.end method
