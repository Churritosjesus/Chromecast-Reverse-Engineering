.class final Lcsf;
.super Lcrp;


# instance fields
.field private final a:Lbwq;


# direct methods
.method public constructor <init>(Lbwq;)V
    .locals 0

    invoke-direct {p0}, Lcrp;-><init>()V

    iput-object p1, p0, Lcsf;->a:Lbwq;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x3

    .line 1000
    invoke-static {v3}, La;->b(I)Z

    move-result v1

    .line 0
    if-eqz v1, :cond_0

    const-string v1, "PeopleClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Owner callback: status="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nresolution="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nholder="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2000
    invoke-static {v3}, La;->b(I)Z

    .line 0
    :cond_0
    invoke-static {p1, v0, p2}, Lcsa;->a(ILjava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    if-nez p3, :cond_1

    :goto_0
    iget-object v2, p0, Lcsf;->a:Lbwq;

    new-instance v3, Lcsh;

    invoke-direct {v3, v1, v0}, Lcsh;-><init>(Lcom/google/android/gms/common/api/Status;Lcsr;)V

    invoke-interface {v2, v3}, Lbwq;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Lcsr;

    invoke-direct {v0, p3}, Lcsr;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    goto :goto_0
.end method
