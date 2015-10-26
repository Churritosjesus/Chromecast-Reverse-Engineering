.class public final Landroid/support/v7/internal/view/menu/ExpandedMenuView;
.super Landroid/widget/ListView;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lqc;
.implements Lqr;


# static fields
.field private static final a:[I


# instance fields
.field private b:Lqa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100d4
        0x1010129
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 50
    const v0, 0x1010074

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 57
    sget-object v0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->a:[I

    invoke-static {p1, p2, v0, p3, v2}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v2}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    :cond_0
    invoke-virtual {v0, v3}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 63
    invoke-virtual {v0, v3}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 1183
    :cond_1
    iget-object v0, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 66
    return-void
.end method


# virtual methods
.method public final a(Lqa;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->b:Lqa;

    .line 71
    return-void
.end method

.method public final a(Lqe;)Z
    .locals 3

    .prologue
    .line 83
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->b:Lqa;

    const/4 v1, 0x0

    .line 1948
    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Lqa;->a(Landroid/view/MenuItem;Lqp;I)Z

    move-result v0

    .line 83
    return v0
.end method

.method protected final onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 75
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    .line 78
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setChildrenDrawingCacheEnabled(Z)V

    .line 79
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .prologue
    .line 89
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqe;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->a(Lqe;)Z

    .line 90
    return-void
.end method
