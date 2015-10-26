.class public final Lbau;
.super Lzr;
.source "PG"


# instance fields
.field public final k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroid/widget/TextView;

.field public final p:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lzr;-><init>(Landroid/view/View;)V

    .line 40
    sget v0, Lf;->n:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Lbau;->k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 41
    sget v0, Lf;->o:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbau;->l:Landroid/widget/TextView;

    .line 42
    sget v0, Lf;->p:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbau;->m:Landroid/widget/TextView;

    .line 43
    sget v0, Lf;->q:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbau;->n:Landroid/widget/TextView;

    .line 44
    sget v0, Lf;->bB:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbau;->o:Landroid/widget/TextView;

    .line 45
    sget v0, Lf;->am:I

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lbau;->p:Landroid/widget/LinearLayout;

    .line 47
    return-void
.end method

.method public static a(Ldbj;)Z
    .locals 1

    .prologue
    .line 144
    if-eqz p0, :cond_0

    iget-object v0, p0, Ldbj;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldbj;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldbj;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
