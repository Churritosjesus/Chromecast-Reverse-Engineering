.class public final Lboj;
.super Lzj;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lboj;->a:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-direct {p0}, Lzj;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 2

    .prologue
    .line 36
    iget-object v0, p0, Lboj;->a:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    iget-object v1, p0, Lboj;->a:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-static {v1}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;)I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;I)I

    .line 37
    return-void
.end method
