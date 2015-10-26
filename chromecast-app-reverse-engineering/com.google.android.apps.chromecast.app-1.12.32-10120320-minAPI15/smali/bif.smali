.class final Lbif;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 462
    iput-object p1, p0, Lbif;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 466
    iget-object v0, p0, Lbif;->a:Lbhf;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbhf;->a(Lbhf;I)V

    .line 467
    return-void
.end method
