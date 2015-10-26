.class public final Lapu;
.super Lj;
.source "PG"


# instance fields
.field private Z:Z

.field private a:Lblp;

.field private aa:Laqd;

.field private ab:Landroid/os/Handler;

.field private ac:Lapd;

.field private ad:Z

.field private ae:Ljava/lang/String;

.field private b:Laqc;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lj;-><init>()V

    .line 64
    return-void
.end method

.method public static a(Ljava/lang/String;Z)Lapu;
    .locals 3

    .prologue
    .line 84
    new-instance v0, Lapu;

    invoke-direct {v0}, Lapu;-><init>()V

    .line 85
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 86
    const-string v2, "ipAddress"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v2, "optInDeviceId"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 88
    invoke-virtual {v0, v1}, Lapu;->f(Landroid/os/Bundle;)V

    .line 89
    return-object v0
.end method

.method static synthetic a(Lapu;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lapu;->p()V

    return-void
.end method

.method static synthetic a(Lapu;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lapu;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lapu;->b:Laqc;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lapu;->b:Laqc;

    invoke-interface {v0, p1}, Laqc;->b(Ljava/lang/String;)V

    .line 304
    :cond_0
    return-void
.end method

.method static synthetic a(Lapu;Z)Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lapu;->ad:Z

    return v0
.end method

.method static synthetic b(Lapu;)V
    .locals 3

    .prologue
    .line 35
    .line 6221
    new-instance v0, Laqa;

    invoke-direct {v0, p0}, Laqa;-><init>(Lapu;)V

    .line 6243
    iget-object v1, p0, Lapu;->aa:Laqd;

    const-string v2, "urn:x-cast:offers"

    .line 7192
    iget-object v1, v1, Laqd;->h:Lapk;

    invoke-virtual {v1, v2, v0}, Lapk;->a(Ljava/lang/String;Lbtd;)Z

    move-result v0

    .line 6243
    if-nez v0, :cond_0

    .line 6244
    invoke-direct {p0}, Lapu;->q()V

    .line 35
    :cond_0
    return-void
.end method

.method static synthetic b(Lapu;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 35
    .line 7254
    iget-object v0, p0, Lapu;->c:Landroid/content/Context;

    invoke-static {v0}, Lblf;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 7255
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7256
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7258
    :cond_0
    :goto_0
    invoke-static {v0}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7259
    iget-object v1, p0, Lapu;->c:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 7260
    iget-object v0, p0, Lapu;->ac:Lapd;

    invoke-virtual {v0, v4}, Lapd;->a(I)Lapd;

    .line 7261
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lapu;->ac:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 7262
    new-array v0, v4, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lapu;->ac:Lapd;

    .line 8093
    iget-object v2, v2, Lapd;->c:Ljava/lang/Long;

    .line 7262
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    .line 7263
    iget-object v0, p0, Lapu;->b:Laqc;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Laqc;->b(Ljava/lang/String;)V

    :goto_1
    return-void

    .line 7256
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 7265
    :cond_2
    invoke-direct {p0}, Lapu;->q()V

    goto :goto_1
.end method

.method static synthetic c(Lapu;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lapu;->q()V

    return-void
.end method

.method static synthetic d(Lapu;)Laqd;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lapu;->aa:Laqd;

    return-object v0
.end method

.method static synthetic e(Lapu;)Lblp;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lapu;->a:Lblp;

    return-object v0
.end method

.method private p()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 188
    new-instance v0, Lapd;

    const/16 v1, 0x3f

    invoke-direct {v0, v1}, Lapd;-><init>(I)V

    iput-object v0, p0, Lapu;->ac:Lapd;

    .line 189
    iput-boolean v5, p0, Lapu;->ad:Z

    .line 190
    invoke-direct {p0}, Lapu;->r()V

    .line 191
    iget-object v1, p0, Lapu;->aa:Laqd;

    new-instance v0, Lapy;

    invoke-direct {v0, p0}, Lapy;-><init>(Lapu;)V

    .line 5077
    iput-object v0, v1, Laqd;->e:Laqf;

    .line 5078
    iput-boolean v2, v1, Laqd;->i:Z

    .line 5079
    iput-boolean v2, v1, Laqd;->j:Z

    .line 5080
    iget-object v0, v1, Laqd;->b:Landroid/content/Context;

    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, v1, Laqd;->f:Ltz;

    .line 5083
    iget-object v0, v1, Laqd;->f:Ltz;

    .line 5130
    invoke-static {}, Ltz;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 5131
    invoke-virtual {v0}, Lug;->b()Landroid/content/ComponentName;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v3

    .line 5132
    const-string v4, "com.google.android.gms.cast.media.CastMediaRouteProviderService"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5084
    :goto_0
    if-eqz v0, :cond_3

    .line 5395
    invoke-static {}, Ltz;->f()V

    .line 5396
    iget-object v0, v0, Lug;->b:Ljava/util/ArrayList;

    .line 5085
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 5086
    iget-object v3, v1, Laqd;->d:Ljava/lang/String;

    invoke-virtual {v1, v0, v3, v5}, Laqd;->a(Luh;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 204
    :goto_1
    iget-object v0, p0, Lapu;->ab:Landroid/os/Handler;

    new-instance v1, Lapz;

    invoke-direct {v1, p0}, Lapz;-><init>(Lapu;)V

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 214
    return-void

    .line 5136
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 5094
    :cond_3
    new-instance v0, Lty;

    invoke-direct {v0}, Lty;-><init>()V

    iget-object v2, v1, Laqd;->c:Ljava/lang/String;

    .line 5095
    invoke-static {v2}, La;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lty;->a(Ljava/lang/String;)Lty;

    move-result-object v0

    .line 5096
    invoke-virtual {v0}, Lty;->a()Ltx;

    move-result-object v0

    .line 5097
    new-instance v2, Laqe;

    invoke-direct {v2, v1, v5}, Laqe;-><init>(Laqd;Z)V

    iput-object v2, v1, Laqd;->g:Lua;

    .line 5121
    iget-object v2, v1, Laqd;->f:Ltz;

    iget-object v1, v1, Laqd;->g:Lua;

    invoke-virtual {v2, v0, v1, v5}, Ltz;->a(Ltx;Lua;I)V

    goto :goto_1
.end method

.method private q()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 274
    iput-boolean v1, p0, Lapu;->ad:Z

    .line 275
    iget-object v0, p0, Lapu;->aa:Laqd;

    .line 6157
    invoke-virtual {v0, v1}, Laqd;->a(Z)V

    .line 276
    iget-object v0, p0, Lapu;->ac:Lapd;

    invoke-virtual {v0, v1}, Lapd;->a(I)Lapd;

    .line 277
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lapu;->ac:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 278
    iget-object v0, p0, Lapu;->b:Laqc;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lapu;->c:Landroid/content/Context;

    sget v1, Lb;->cg:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lapu;->ae:Ljava/lang/String;

    .line 280
    iget-object v0, p0, Lapu;->b:Laqc;

    iget-object v1, p0, Lapu;->ae:Ljava/lang/String;

    invoke-interface {v0, v1}, Laqc;->b(Ljava/lang/String;)V

    .line 282
    :cond_0
    return-void
.end method

.method private r()V
    .locals 3

    .prologue
    .line 288
    iget-object v0, p0, Lapu;->b:Laqc;

    iget-object v1, p0, Lapu;->c:Landroid/content/Context;

    sget v2, Lb;->cT:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laqb;

    invoke-direct {v2, p0}, Laqb;-><init>(Lapu;)V

    invoke-interface {v0, v1, v2}, Laqc;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 298
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 132
    invoke-super {p0}, Lj;->a()V

    .line 134
    iput-object v0, p0, Lapu;->b:Laqc;

    .line 135
    iput-object v0, p0, Lapu;->c:Landroid/content/Context;

    .line 136
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 97
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    move-object v0, p1

    .line 98
    check-cast v0, Laqc;

    iput-object v0, p0, Lapu;->b:Laqc;

    .line 99
    iput-object p1, p0, Lapu;->c:Landroid/content/Context;

    .line 100
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 107
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 108
    const-string v1, "ipAddress"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lapu;->d:Ljava/lang/String;

    .line 2559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 109
    const-string v1, "optInDeviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lapu;->Z:Z

    .line 112
    invoke-virtual {p0, v5}, Lapu;->c(Z)V

    .line 114
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lapu;->ab:Landroid/os/Handler;

    .line 115
    new-instance v0, Lblp;

    const-string v1, "OffersChecker"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lapu;->a:Lblp;

    .line 3151
    new-instance v0, Laqd;

    iget-object v1, p0, Lapu;->c:Landroid/content/Context;

    iget-object v2, p0, Lapu;->c:Landroid/content/Context;

    invoke-static {v2}, Lblf;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lapu;->d:Ljava/lang/String;

    iget-object v4, p0, Lapu;->a:Lblp;

    invoke-direct {v0, v1, v2, v3, v4}, Laqd;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lblp;)V

    iput-object v0, p0, Lapu;->aa:Laqd;

    .line 3154
    iget-boolean v0, p0, Lapu;->Z:Z

    if-eqz v0, :cond_0

    .line 3155
    invoke-direct {p0}, Lapu;->p()V

    .line 3156
    :goto_0
    return-void

    .line 3158
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lapu;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lb;->da:I

    .line 3159
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->cZ:I

    new-instance v2, Lapx;

    invoke-direct {v2, p0}, Lapx;-><init>(Lapu;)V

    .line 3160
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lb;->cY:I

    new-instance v2, Lapw;

    invoke-direct {v2, p0}, Lapw;-><init>(Lapu;)V

    .line 3167
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 3174
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lapv;

    invoke-direct {v1, p0}, Lapv;-><init>(Lapu;)V

    .line 3175
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 3181
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public final h_()V
    .locals 2

    .prologue
    .line 140
    invoke-super {p0}, Lj;->h_()V

    .line 141
    iget-object v0, p0, Lapu;->aa:Laqd;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lapu;->aa:Laqd;

    .line 4157
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laqd;->a(Z)V

    .line 144
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 121
    invoke-super {p0}, Lj;->j()V

    .line 123
    iget-boolean v0, p0, Lapu;->ad:Z

    if-eqz v0, :cond_1

    .line 124
    invoke-direct {p0}, Lapu;->r()V

    .line 128
    :cond_0
    :goto_0
    return-void

    .line 125
    :cond_1
    iget-object v0, p0, Lapu;->ae:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lapu;->ae:Ljava/lang/String;

    invoke-direct {p0, v0}, Lapu;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
