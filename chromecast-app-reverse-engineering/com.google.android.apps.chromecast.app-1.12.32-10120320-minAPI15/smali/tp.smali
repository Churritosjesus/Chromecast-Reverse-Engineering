.class public final Ltp;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Bundle;

.field private b:Ltx;


# direct methods
.method public constructor <init>(Ltx;Z)V
    .locals 3

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    if-nez p1, :cond_0

    .line 42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ltp;->a:Landroid/os/Bundle;

    .line 46
    iput-object p1, p0, Ltp;->b:Ltx;

    .line 47
    iget-object v0, p0, Ltp;->a:Landroid/os/Bundle;

    const-string v1, "selector"

    .line 1196
    iget-object v2, p1, Ltx;->a:Landroid/os/Bundle;

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 48
    iget-object v0, p0, Ltp;->a:Landroid/os/Bundle;

    const-string v1, "activeScan"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 49
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Ltp;->b:Ltx;

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p0, Ltp;->a:Landroid/os/Bundle;

    const-string v1, "selector"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ltx;->a(Landroid/os/Bundle;)Ltx;

    move-result-object v0

    iput-object v0, p0, Ltp;->b:Ltx;

    .line 66
    iget-object v0, p0, Ltp;->b:Ltx;

    if-nez v0, :cond_0

    .line 67
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Ltp;->b:Ltx;

    .line 70
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ltx;
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Ltp;->c()V

    .line 60
    iget-object v0, p0, Ltp;->b:Ltx;

    return-object v0
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Ltp;->a:Landroid/os/Bundle;

    const-string v1, "activeScan"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 91
    instance-of v1, p1, Ltp;

    if-eqz v1, :cond_0

    .line 92
    check-cast p1, Ltp;

    .line 93
    invoke-virtual {p0}, Ltp;->a()Ltx;

    move-result-object v1

    invoke-virtual {p1}, Ltp;->a()Ltx;

    move-result-object v2

    invoke-virtual {v1, v2}, Ltx;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ltp;->b()Z

    move-result v1

    invoke-virtual {p1}, Ltp;->b()Z

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 96
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 101
    invoke-virtual {p0}, Ltp;->a()Ltx;

    move-result-object v0

    invoke-virtual {v0}, Ltx;->hashCode()I

    move-result v1

    invoke-virtual {p0}, Ltp;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    xor-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    const-string v0, "DiscoveryRequest{ selector="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ltp;->a()Ltx;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    const-string v0, ", activeScan="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ltp;->b()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 109
    const-string v0, ", isValid="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 2085
    invoke-direct {p0}, Ltp;->c()V

    .line 2086
    iget-object v0, p0, Ltp;->b:Ltx;

    .line 2156
    invoke-virtual {v0}, Ltx;->b()V

    .line 2157
    iget-object v0, v0, Ltx;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2158
    const/4 v0, 0x0

    .line 109
    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    const-string v0, " }"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2160
    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
