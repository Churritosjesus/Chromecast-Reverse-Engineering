.class public final Laqd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lblp;

.field final b:Landroid/content/Context;

.field final c:Ljava/lang/String;

.field final d:Ljava/lang/String;

.field e:Laqf;

.field f:Ltz;

.field g:Lua;

.field h:Lapk;

.field i:Z

.field j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lblp;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Laqd;->b:Landroid/content/Context;

    .line 57
    iput-object p2, p0, Laqd;->c:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Laqd;->d:Ljava/lang/String;

    .line 59
    iput-object p4, p0, Laqd;->a:Lblp;

    .line 60
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 196
    iget-object v0, p0, Laqd;->f:Ltz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laqd;->g:Lua;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Laqd;->f:Ltz;

    iget-object v1, p0, Laqd;->g:Lua;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Laqd;->g:Lua;

    .line 200
    :cond_0
    return-void
.end method

.method a(Z)V
    .locals 1

    .prologue
    .line 166
    iget-boolean v0, p0, Laqd;->i:Z

    if-nez v0, :cond_1

    .line 167
    const/4 v0, 0x1

    iput-boolean v0, p0, Laqd;->i:Z

    .line 168
    invoke-virtual {p0}, Laqd;->a()V

    .line 169
    iget-object v0, p0, Laqd;->h:Lapk;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Laqd;->h:Lapk;

    invoke-virtual {v0}, Lapk;->c()V

    .line 172
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Laqd;->e:Laqf;

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Laqd;->e:Laqf;

    invoke-interface {v0}, Laqf;->b()V

    .line 176
    :cond_1
    return-void
.end method

.method a(Luh;Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 144
    .line 2231
    iget-object v0, p1, Luh;->m:Landroid/os/Bundle;

    .line 144
    invoke-static {v0}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v0

    .line 3000
    iget-object v0, v0, Lcom/google/android/gms/cast/CastDevice;->d:Ljava/net/Inet4Address;

    .line 145
    invoke-virtual {v0}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    new-instance v1, Laqg;

    invoke-direct {v1, p0, p3}, Laqg;-><init>(Laqd;Z)V

    invoke-static {p1, v0, v1}, Lapk;->a(Luh;Landroid/content/Context;Lapt;)Lapk;

    move-result-object v0

    iput-object v0, p0, Laqd;->h:Lapk;

    .line 148
    const/4 v0, 0x1

    .line 150
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
