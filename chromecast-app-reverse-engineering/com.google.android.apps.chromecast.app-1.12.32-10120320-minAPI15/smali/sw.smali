.class final Lsw;
.super Lyc;
.source "PG"

# interfaces
.implements Lta;


# instance fields
.field final synthetic a:Lsr;

.field private i:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Lsr;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 983
    iput-object p1, p0, Lsw;->a:Lsr;

    .line 984
    invoke-direct {p0, p2, p3, p4}, Lyc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1435
    iput-object p1, p0, Lyc;->g:Landroid/view/View;

    .line 987
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lsw;->a(Z)V

    .line 2281
    const/4 v0, 0x0

    iput v0, p0, Lyc;->f:I

    .line 990
    new-instance v0, Lsx;

    invoke-direct {v0, p0, p1}, Lsx;-><init>(Lsw;Lsr;)V

    .line 2541
    iput-object v0, p0, Lyc;->h:Landroid/widget/AdapterView$OnItemClickListener;

    .line 1001
    return-void
.end method

.method static synthetic a(Lsw;)Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 976
    iget-object v0, p0, Lsw;->i:Landroid/widget/ListAdapter;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/widget/ListAdapter;)V
    .locals 0

    .prologue
    .line 1005
    invoke-super {p0, p1}, Lyc;->a(Landroid/widget/ListAdapter;)V

    .line 1006
    iput-object p1, p0, Lsw;->i:Landroid/widget/ListAdapter;

    .line 1007
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 1016
    return-void
.end method
