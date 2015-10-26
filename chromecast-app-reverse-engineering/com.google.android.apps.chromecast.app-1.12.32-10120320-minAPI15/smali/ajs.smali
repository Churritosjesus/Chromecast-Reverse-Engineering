.class final Lajs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lajq;


# direct methods
.method constructor <init>(Lajq;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lajs;->a:Lajq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lajs;->a:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    .line 368
    return-void
.end method
