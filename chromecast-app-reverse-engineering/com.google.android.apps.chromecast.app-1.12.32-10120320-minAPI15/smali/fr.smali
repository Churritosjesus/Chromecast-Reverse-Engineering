.class public final Lfr;
.super Lfq;
.source "PG"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# direct methods
.method public constructor <init>(Lfs;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lfq;-><init>(Lfs;)V

    .line 39
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lfr;->a:Lfs;

    invoke-interface {v0, p1, p2, p3, p4}, Lfs;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
