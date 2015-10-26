.class final Lbez;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:I

.field private synthetic b:Lbey;


# direct methods
.method constructor <init>(Lbey;I)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lbez;->b:Lbey;

    iput p2, p0, Lbez;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lbez;->b:Lbey;

    .line 1079
    iget-object v0, v0, Lbey;->b:Lbdn;

    .line 97
    iget v1, p0, Lbez;->a:I

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    .line 98
    return-void
.end method
