.class public final Lwe;
.super Lxv;
.source "PG"


# instance fields
.field public a:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public b:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public c:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public d:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public e:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    const/4 v0, -0x2

    .line 802
    invoke-direct {p0, v0, v0}, Lxv;-><init>(II)V

    .line 803
    const/4 v0, 0x0

    iput-boolean v0, p0, Lwe;->a:Z

    .line 804
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 789
    invoke-direct {p0, p1, p2}, Lxv;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 790
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .prologue
    .line 793
    invoke-direct {p0, p1}, Lxv;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 794
    return-void
.end method

.method public constructor <init>(Lwe;)V
    .locals 1

    .prologue
    .line 797
    invoke-direct {p0, p1}, Lxv;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 798
    iget-boolean v0, p1, Lwe;->a:Z

    iput-boolean v0, p0, Lwe;->a:Z

    .line 799
    return-void
.end method
