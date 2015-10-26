.class public final Lmz;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/view/LayoutInflater;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Ljava/lang/CharSequence;

.field public e:Landroid/view/View;

.field public f:Z

.field public g:Landroid/content/DialogInterface$OnKeyListener;

.field public h:Landroid/widget/ListAdapter;

.field public i:Landroid/content/DialogInterface$OnClickListener;

.field public j:I

.field private k:I

.field private l:I

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 670
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 617
    iput v0, p0, Lmz;->k:I

    .line 619
    iput v0, p0, Lmz;->l:I

    .line 642
    iput-boolean v0, p0, Lmz;->m:Z

    .line 646
    const/4 v0, -0x1

    iput v0, p0, Lmz;->j:I

    .line 671
    iput-object p1, p0, Lmz;->a:Landroid/content/Context;

    .line 672
    const/4 v0, 0x1

    iput-boolean v0, p0, Lmz;->f:Z

    .line 673
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lmz;->b:Landroid/view/LayoutInflater;

    .line 674
    return-void
.end method
