.class public final Lbbn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwg;
.implements Lbwh;


# instance fields
.field public a:Ljava/lang/Boolean;

.field public b:Lcom/google/android/gms/cast/CastDevice;

.field c:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public final d:Ltz;

.field private final e:Lblp;

.field private final f:Landroid/content/Context;

.field private final g:Lbve;

.field private final h:Landroid/os/Handler;

.field private final i:Ljava/util/ArrayList;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lblp;

    const-string v1, "CastScreenTracker"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbbn;->e:Lblp;

    .line 41
    iput-object v2, p0, Lbbn;->a:Ljava/lang/Boolean;

    .line 42
    iput-object v2, p0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbbn;->i:Ljava/util/ArrayList;

    .line 64
    iput-object p1, p0, Lbbn;->f:Landroid/content/Context;

    .line 65
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbbn;->h:Landroid/os/Handler;

    .line 66
    iget-object v0, p0, Lbbn;->f:Landroid/content/Context;

    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, p0, Lbbn;->d:Ltz;

    .line 68
    invoke-static {}, Lbvq;->a()Lbvq;

    iget-object v0, p0, Lbbn;->f:Landroid/content/Context;

    invoke-static {v0}, Lbvq;->a(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 70
    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lbbn;->f:Landroid/content/Context;

    invoke-static {v0}, Lbls;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1209
    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1212
    :cond_0
    new-instance v0, Lbwf;

    iget-object v1, p0, Lbbn;->f:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p0}, Lbwf;-><init>(Landroid/content/Context;Lbwg;Lbwh;)V

    sget-object v1, Lbvc;->b:Lbvz;

    .line 1213
    invoke-virtual {v0, v1}, Lbwf;->a(Lbvz;)Lbwf;

    move-result-object v0

    .line 1214
    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 1215
    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    .line 73
    :cond_1
    new-instance v0, Lbbo;

    invoke-direct {v0, p0}, Lbbo;-><init>(Lbbn;)V

    iput-object v0, p0, Lbbn;->g:Lbve;

    .line 80
    return-void

    .line 68
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Lbbn;
    .locals 2

    .prologue
    .line 53
    invoke-static {}, Lblf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    new-instance v0, Lbbn;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lbbn;-><init>(Landroid/content/Context;)V

    .line 56
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lbbn;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 32
    .line 2117
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lbbn;->a:Ljava/lang/Boolean;

    .line 2118
    iget-object v0, p0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    invoke-direct {p0, v0, v2}, Lbbn;->a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V

    .line 2119
    if-eqz p1, :cond_0

    .line 2120
    iget-object v0, p0, Lbbn;->h:Landroid/os/Handler;

    new-instance v1, Lbbp;

    invoke-direct {v1, p0}, Lbbp;-><init>(Lbbn;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2129
    :cond_0
    iput-object v2, p0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 32
    return-void
.end method

.method private a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lbbn;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbbt;

    .line 134
    invoke-interface {v0, p1, p2}, Lbbt;->a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V

    goto :goto_0

    .line 136
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 232
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 233
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 226
    invoke-virtual {p0}, Lbbn;->d()V

    .line 227
    sget-object v0, Lbvc;->c:Lbvf;

    iget-object v1, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lbbn;->g:Lbve;

    invoke-virtual {v0, v1, v2}, Lbvf;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lbve;)V

    .line 228
    return-void
.end method

.method public final a(Lbbt;)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lbbn;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    return-void
.end method

.method public final a(Lcom/google/android/gms/cast/CastDevice;)V
    .locals 1

    .prologue
    .line 105
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lbbn;->a:Ljava/lang/Boolean;

    .line 106
    iget-object v0, p0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    invoke-direct {p0, v0, p1}, Lbbn;->a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastDevice;)V

    .line 107
    iput-object p1, p0, Lbbn;->b:Lcom/google/android/gms/cast/CastDevice;

    .line 108
    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    .prologue
    .line 220
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x12

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "ConnectionFailed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lbbn;->a:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lbbt;)V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lbbn;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 88
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lbbn;->a:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbbn;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 192
    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    sget-object v0, Lbvc;->c:Lbvf;

    iget-object v1, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lbvf;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;

    move-result-object v0

    new-instance v1, Lbbr;

    invoke-direct {v1, p0}, Lbbr;-><init>(Lbbn;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 201
    iget-object v0, p0, Lbbn;->f:Landroid/content/Context;

    iget-object v1, p0, Lbbn;->f:Landroid/content/Context;

    sget v2, Lb;->ap:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 202
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 206
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 251
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    sget-object v0, Lbvc;->c:Lbvf;

    iget-object v1, p0, Lbbn;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lbvf;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;

    move-result-object v0

    new-instance v1, Lbbs;

    invoke-direct {v1, p0}, Lbbs;-><init>(Lbbn;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    goto :goto_0
.end method
