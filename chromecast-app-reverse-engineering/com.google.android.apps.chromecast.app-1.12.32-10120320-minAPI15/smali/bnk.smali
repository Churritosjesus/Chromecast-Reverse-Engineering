.class final Lbnk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldcw;

.field private synthetic b:Laow;

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Landroid/view/View;

.field private synthetic e:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Ldcw;Laow;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1233
    iput-object p1, p0, Lbnk;->e:Lbmu;

    iput-object p2, p0, Lbnk;->a:Ldcw;

    iput-object p3, p0, Lbnk;->b:Laow;

    iput-object p4, p0, Lbnk;->c:Ljava/lang/String;

    iput-object p5, p0, Lbnk;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    .line 1236
    iget-object v0, p0, Lbnk;->a:Ldcw;

    invoke-virtual {v0}, Ldcw;->b()Ldco;

    move-result-object v0

    sget-object v1, Ldco;->c:Ldco;

    if-ne v0, v1, :cond_1

    .line 1237
    iget-object v0, p0, Lbnk;->e:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->e:Lash;

    .line 1237
    iget-object v1, p0, Lbnk;->b:Laow;

    .line 2474
    iget-object v1, v1, Laow;->j:Ljava/lang/String;

    .line 1237
    invoke-virtual {v0, v1}, Lash;->a(Ljava/lang/String;)Z

    move-result v4

    .line 1239
    iget-object v0, p0, Lbnk;->e:Lbmu;

    .line 3069
    iget-object v0, v0, Lbmu;->h:Landroid/content/Context;

    .line 1240
    iget-object v1, p0, Lbnk;->b:Laow;

    invoke-virtual {v1}, Laow;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lbnk;->b:Laow;

    .line 1241
    invoke-virtual {v2}, Laow;->n()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbnk;->b:Laow;

    .line 3597
    iget-object v3, v3, Laow;->c:Lbdf;

    .line 1241
    iget-object v5, p0, Lbnk;->b:Laow;

    .line 4474
    iget-object v5, v5, Laow;->j:Ljava/lang/String;

    .line 1242
    iget-object v6, p0, Lbnk;->b:Laow;

    .line 4479
    iget-object v6, v6, Laow;->k:Ljava/lang/String;

    .line 1240
    invoke-static/range {v0 .. v6}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbdf;ZLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 1244
    iget-object v1, p0, Lbnk;->e:Lbmu;

    .line 5069
    iget-object v1, v1, Lbmu;->h:Landroid/content/Context;

    .line 1244
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1258
    :cond_0
    :goto_0
    return-void

    .line 1245
    :cond_1
    iget-object v0, p0, Lbnk;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1246
    iget-object v0, p0, Lbnk;->c:Ljava/lang/String;

    iget-object v1, p0, Lbnk;->d:Landroid/view/View;

    .line 1247
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 1246
    invoke-static {v0, v1}, Lasr;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 1248
    iget-object v1, p0, Lbnk;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1250
    iget-object v0, p0, Lbnk;->b:Laow;

    invoke-virtual {v0}, Laow;->o()Latu;

    move-result-object v0

    .line 5293
    iget-object v0, v0, Latu;->e:Ldbw;

    .line 1251
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    const/16 v3, 0x41

    if-nez v0, :cond_2

    .line 1253
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 1251
    invoke-virtual {v1, v2}, Lape;->a(Lapd;)V

    goto :goto_0

    .line 6173
    :cond_2
    iget v0, v0, Ldbw;->b:I

    goto :goto_1
.end method
