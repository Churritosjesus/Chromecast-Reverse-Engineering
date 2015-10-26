.class final Lcsd;
.super Lcrp;


# instance fields
.field private final a:Lbwq;


# direct methods
.method public constructor <init>(Lbwq;)V
    .locals 0

    invoke-direct {p0}, Lcrp;-><init>()V

    iput-object p1, p0, Lcsd;->a:Lbwq;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    .line 1000
    invoke-static {v2}, La;->b(I)Z

    move-result v0

    .line 0
    if-eqz v0, :cond_0

    const-string v0, "PeopleClient"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bundle callback: status="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nresolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nbundle="

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

    move-result-object v0

    iget-object v1, p0, Lcsd;->a:Lbwq;

    new-instance v2, Lcse;

    invoke-direct {v2, v0}, Lcse;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v1, v2}, Lbwq;->a(Ljava/lang/Object;)V

    return-void
.end method
