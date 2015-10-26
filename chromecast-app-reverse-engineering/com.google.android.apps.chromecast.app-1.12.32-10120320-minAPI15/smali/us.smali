.class final Lus;
.super Ltq;
.source "PG"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field static final i:Z


# instance fields
.field final j:Landroid/content/ComponentName;

.field k:Z

.field l:Lut;

.field private final m:Lux;

.field private final n:Ljava/util/ArrayList;

.field private o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 47
    const-string v0, "MediaRouteProviderProxy"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lus;->i:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;)V
    .locals 1

    .prologue
    .line 59
    new-instance v0, Ltt;

    invoke-direct {v0, p2}, Ltt;-><init>(Landroid/content/ComponentName;)V

    invoke-direct {p0, p1, v0}, Ltq;-><init>(Landroid/content/Context;Ltt;)V

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    .line 61
    iput-object p2, p0, Lus;->j:Landroid/content/ComponentName;

    .line 62
    new-instance v0, Lux;

    .line 1594
    invoke-direct {v0, p0}, Lux;-><init>(Lus;)V

    .line 62
    iput-object v0, p0, Lus;->m:Lux;

    .line 63
    return-void
.end method

.method static synthetic a(Lus;)Lux;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lus;->m:Lux;

    return-object v0
.end method

.method static synthetic a(Lus;Lut;)V
    .locals 4

    .prologue
    .line 44
    .line 8220
    iget-object v0, p0, Lus;->l:Lut;

    if-ne v0, p1, :cond_1

    .line 8221
    const/4 v0, 0x1

    iput-boolean v0, p0, Lus;->p:Z

    .line 8276
    iget-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 8277
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 8278
    iget-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luw;

    iget-object v3, p0, Lus;->l:Lut;

    invoke-virtual {v0, v3}, Luw;->a(Lut;)V

    .line 8277
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 9136
    :cond_0
    iget-object v0, p0, Ltq;->e:Ltp;

    .line 8225
    if-eqz v0, :cond_1

    .line 8226
    iget-object v1, p0, Lus;->l:Lut;

    invoke-virtual {v1, v0}, Lut;->a(Ltp;)V

    .line 44
    :cond_1
    return-void
.end method

.method static synthetic a(Lus;Lut;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 44
    .line 7241
    iget-object v0, p0, Lus;->l:Lut;

    if-ne v0, p1, :cond_1

    .line 7242
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 7243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Service connection error - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7245
    :cond_0
    invoke-virtual {p0}, Lus;->e()V

    .line 44
    :cond_1
    return-void
.end method

.method static synthetic a(Lus;Lut;Ltv;)V
    .locals 2

    .prologue
    .line 44
    .line 7251
    iget-object v0, p0, Lus;->l:Lut;

    if-ne v0, p1, :cond_1

    .line 7252
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 7253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Descriptor changed, descriptor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7255
    :cond_0
    invoke-virtual {p0, p2}, Lus;->a(Ltv;)V

    .line 44
    :cond_1
    return-void
.end method

.method static synthetic a(Lus;Luw;)V
    .locals 1

    .prologue
    .line 44
    .line 6270
    iget-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6271
    invoke-virtual {p1}, Luw;->d()V

    .line 6272
    invoke-virtual {p0}, Lus;->b()V

    .line 44
    return-void
.end method

.method static synthetic b(Lus;Lut;)V
    .locals 2

    .prologue
    .line 44
    .line 9232
    iget-object v0, p0, Lus;->l:Lut;

    if-ne v0, p1, :cond_1

    .line 9233
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 9234
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Service connection died"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9236
    :cond_0
    invoke-direct {p0}, Lus;->g()V

    .line 44
    :cond_1
    return-void
.end method

.method static synthetic f()Z
    .locals 1

    .prologue
    .line 44
    sget-boolean v0, Lus;->i:Z

    return v0
.end method

.method private g()V
    .locals 6

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 260
    iget-object v0, p0, Lus;->l:Lut;

    if-eqz v0, :cond_1

    .line 261
    invoke-virtual {p0, v4}, Lus;->a(Ltv;)V

    .line 262
    iput-boolean v2, p0, Lus;->p:Z

    .line 5283
    iget-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v2

    .line 5284
    :goto_0
    if-ge v1, v3, :cond_0

    .line 5285
    iget-object v0, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luw;

    invoke-virtual {v0}, Luw;->d()V

    .line 5284
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 264
    :cond_0
    iget-object v0, p0, Lus;->l:Lut;

    .line 5423
    const/4 v1, 0x2

    move v3, v2

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lut;->a(IIILjava/lang/Object;Landroid/os/Bundle;)Z

    .line 5424
    iget-object v1, v0, Lut;->b:Luy;

    .line 5616
    iget-object v1, v1, Luy;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->clear()V

    .line 5425
    iget-object v1, v0, Lut;->a:Landroid/os/Messenger;

    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-interface {v1, v0, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 5427
    iget-object v1, v0, Lut;->h:Lus;

    .line 6044
    iget-object v1, v1, Lus;->m:Lux;

    .line 5427
    new-instance v2, Luu;

    invoke-direct {v2, v0}, Luu;-><init>(Lut;)V

    invoke-virtual {v1, v2}, Lux;->post(Ljava/lang/Runnable;)Z

    .line 265
    iput-object v4, p0, Lus;->l:Lut;

    .line 267
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ltu;
    .locals 4

    .prologue
    .line 67
    .line 2207
    iget-object v0, p0, Ltq;->g:Ltv;

    .line 68
    if-eqz v0, :cond_2

    .line 69
    invoke-virtual {v0}, Ltv;->a()Ljava/util/List;

    move-result-object v2

    .line 70
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 71
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_2

    .line 72
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltn;

    .line 73
    invoke-virtual {v0}, Ltn;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    new-instance v0, Luw;

    invoke-direct {v0, p0, p1}, Luw;-><init>(Lus;Ljava/lang/String;)V

    .line 75
    iget-object v1, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-boolean v1, p0, Lus;->p:Z

    if-eqz v1, :cond_0

    .line 77
    iget-object v1, p0, Lus;->l:Lut;

    invoke-virtual {v0, v1}, Luw;->a(Lut;)V

    .line 79
    :cond_0
    invoke-virtual {p0}, Lus;->b()V

    .line 84
    :goto_1
    return-object v0

    .line 71
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 84
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 101
    iget-boolean v0, p0, Lus;->k:Z

    if-nez v0, :cond_1

    .line 102
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Starting"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lus;->k:Z

    .line 107
    invoke-virtual {p0}, Lus;->b()V

    .line 109
    :cond_1
    return-void
.end method

.method b()V
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p0}, Lus;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p0}, Lus;->d()V

    .line 135
    :goto_0
    return-void

    .line 133
    :cond_0
    invoke-virtual {p0}, Lus;->e()V

    goto :goto_0
.end method

.method public final b(Ltp;)V
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Lus;->p:Z

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lus;->l:Lut;

    invoke-virtual {v0, p1}, Lut;->a(Ltp;)V

    .line 92
    :cond_0
    invoke-virtual {p0}, Lus;->b()V

    .line 93
    return-void
.end method

.method c()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 138
    iget-boolean v1, p0, Lus;->k:Z

    if-eqz v1, :cond_2

    .line 3136
    iget-object v1, p0, Ltq;->e:Ltp;

    .line 140
    if-eqz v1, :cond_1

    .line 150
    :cond_0
    :goto_0
    return v0

    .line 146
    :cond_1
    iget-object v1, p0, Lus;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 150
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method d()V
    .locals 3

    .prologue
    .line 154
    iget-boolean v0, p0, Lus;->o:Z

    if-nez v0, :cond_1

    .line 155
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Binding"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.MediaRouteProviderService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 160
    iget-object v1, p0, Lus;->j:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 4099
    :try_start_0
    iget-object v1, p0, Ltq;->a:Landroid/content/Context;

    .line 162
    const/4 v2, 0x1

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lus;->o:Z

    .line 163
    iget-boolean v0, p0, Lus;->o:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_1

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Bind failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 172
    :cond_1
    :goto_0
    return-void

    .line 167
    :catch_0
    move-exception v0

    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_1

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Bind failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method e()V
    .locals 2

    .prologue
    .line 175
    iget-boolean v0, p0, Lus;->o:Z

    if-eqz v0, :cond_1

    .line 176
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Unbinding"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lus;->o:Z

    .line 181
    invoke-direct {p0}, Lus;->g()V

    .line 5099
    iget-object v0, p0, Ltq;->a:Landroid/content/Context;

    .line 182
    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 184
    :cond_1
    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .prologue
    .line 188
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Connected"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    :cond_0
    iget-boolean v0, p0, Lus;->o:Z

    if-eqz v0, :cond_1

    .line 193
    invoke-direct {p0}, Lus;->g()V

    .line 195
    if-eqz p2, :cond_2

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 196
    :goto_0
    invoke-static {v0}, La;->a(Landroid/os/Messenger;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 197
    new-instance v1, Lut;

    invoke-direct {v1, p0, v0}, Lut;-><init>(Lus;Landroid/os/Messenger;)V

    .line 198
    invoke-virtual {v1}, Lut;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 199
    iput-object v1, p0, Lus;->l:Lut;

    .line 209
    :cond_1
    :goto_1
    return-void

    .line 195
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 201
    :cond_3
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_1

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Registration failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 206
    :cond_4
    const-string v0, "MediaRouteProviderProxy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Service returned invalid messenger binder"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 213
    sget-boolean v0, Lus;->i:Z

    if-eqz v0, :cond_0

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Service disconnected"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    :cond_0
    invoke-direct {p0}, Lus;->g()V

    .line 217
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Service connection "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lus;->j:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
