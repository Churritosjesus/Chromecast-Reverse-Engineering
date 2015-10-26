.class final Laws;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field private synthetic a:Lawr;


# direct methods
.method constructor <init>(Lawr;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Laws;->a:Lawr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Laws;->a:Lawr;

    iget-object v1, p0, Laws;->a:Lawr;

    invoke-static {v1}, Lawr;->a(Lawr;)Landroid/widget/ScrollView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v1

    invoke-static {v0, v1}, Lawr;->a(Lawr;I)V

    .line 98
    return-void
.end method
