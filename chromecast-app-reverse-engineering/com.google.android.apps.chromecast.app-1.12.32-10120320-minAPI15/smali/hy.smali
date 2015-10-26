.class public final Lhy;
.super Landroid/database/DataSetObserver;
.source "PG"


# instance fields
.field private synthetic a:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0

    .prologue
    .line 2902
    iput-object p1, p0, Lhy;->a:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .prologue
    .line 2905
    iget-object v0, p0, Lhy;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->a()V

    .line 2906
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .prologue
    .line 2909
    iget-object v0, p0, Lhy;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->a()V

    .line 2910
    return-void
.end method
