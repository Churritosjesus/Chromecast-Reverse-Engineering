.class final Lahr;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:I

.field public b:Lahq;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 900
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 901
    const/4 v0, 0x0

    iput v0, p0, Lahr;->a:I

    .line 902
    sget-object v0, Lahq;->a:Lahq;

    iput-object v0, p0, Lahr;->b:Lahq;

    return-void
.end method
