.class final Latp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lm;

.field private synthetic b:I


# direct methods
.method constructor <init>(Latf;Lm;I)V
    .locals 0

    .prologue
    .line 469
    iput-object p2, p0, Latp;->a:Lm;

    iput p3, p0, Latp;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 472
    iget-object v0, p0, Latp;->a:Lm;

    iget v1, p0, Latp;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lbls;->a(Lm;ILblu;)V

    .line 473
    return-void
.end method
