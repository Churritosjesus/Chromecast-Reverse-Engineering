.class public final Lczt;
.super Landroid/database/DataSetObserver;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lczt;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lczt;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    iget-object v1, p0, Lczt;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-static {v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    .line 1474
    iget-object v1, v1, Landroid/support/v4/view/ViewPager;->a:Lgn;

    .line 171
    invoke-virtual {v1}, Lgn;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;I)V

    .line 172
    return-void
.end method
