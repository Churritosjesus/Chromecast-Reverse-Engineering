.class final Lae;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    .line 2144
    new-instance v0, Lad;

    invoke-direct {v0, p1}, Lad;-><init>(Landroid/os/Parcel;)V

    .line 142
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    .line 1148
    new-array v0, p1, [Lad;

    .line 142
    return-object v0
.end method
