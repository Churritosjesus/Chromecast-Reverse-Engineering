.class public final Lczs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private synthetic a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lczs;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lczs;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z

    .line 156
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 159
    iget-object v0, p0, Lczs;->a:Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;->a(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Z)Z

    .line 160
    return-void
.end method
