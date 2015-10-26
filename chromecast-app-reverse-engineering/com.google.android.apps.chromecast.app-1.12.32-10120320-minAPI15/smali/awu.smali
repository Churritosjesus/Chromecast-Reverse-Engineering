.class final Lawu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lawt;


# direct methods
.method constructor <init>(Lawt;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lawu;->a:Lawt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lawu;->a:Lawt;

    iget-object v0, v0, Lawt;->a:Lawr;

    invoke-static {v0}, Lawr;->a(Lawr;)Landroid/widget/ScrollView;

    move-result-object v0

    const/16 v1, 0x82

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->fullScroll(I)Z

    .line 169
    return-void
.end method
